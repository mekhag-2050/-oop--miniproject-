package rental.system;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class VehicleManagementFrame extends JFrame {
    DefaultTableModel model;
    JTable table;

    public VehicleManagementFrame() {
        setTitle("Vehicle Management");
        setSize(900, 600);
        setMinimumSize(new Dimension(650, 450));
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout(15, 15));
        mainPanel.setBackground(new Color(235, 242, 250));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Vehicle Management");
        title.setFont(new Font("Arial", Font.BOLD, 25));
        title.setForeground(new Color(25, 65, 115));
        title.setBorder(BorderFactory.createEmptyBorder(5, 5, 10, 5));

        model = new DefaultTableModel(
                new String[]{"Name", "Number", "Type", "Rent", "Available"}, 0);

        table = new JTable(model);
        table.setFont(new Font("Arial", Font.PLAIN, 15));
        table.setRowHeight(32);
        table.setBackground(Color.WHITE);
        table.setForeground(new Color(40, 50, 65));
        table.setSelectionBackground(new Color(200, 222, 248));
        table.setSelectionForeground(Color.BLACK);
        table.setGridColor(new Color(220, 228, 238));
        table.setFillsViewportHeight(true);

        table.getTableHeader().setFont(
                new Font("Arial", Font.BOLD, 15));
        table.getTableHeader().setBackground(
                new Color(35, 100, 180));
        table.getTableHeader().setForeground(Color.WHITE);
        table.getTableHeader().setPreferredSize(new Dimension(0, 38));

        refreshTable();

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createLineBorder(
                new Color(210, 220, 235)));

        JButton add = new JButton("Add Vehicle");
        JButton delete = new JButton("Delete Vehicle");
        JButton refresh = new JButton("Refresh");

        add.setFont(new Font("Arial", Font.BOLD, 14));
        add.setBackground(new Color(35, 100, 180));
        add.setForeground(Color.WHITE);
        add.setFocusPainted(false);

        delete.setFont(new Font("Arial", Font.BOLD, 14));
        delete.setBackground(new Color(190, 60, 60));
        delete.setForeground(Color.WHITE);
        delete.setFocusPainted(false);

        refresh.setFont(new Font("Arial", Font.BOLD, 14));
        refresh.setBackground(new Color(225, 237, 250));
        refresh.setForeground(new Color(25, 65, 115));
        refresh.setFocusPainted(false);

        add.setPreferredSize(new Dimension(150, 40));
        delete.setPreferredSize(new Dimension(170, 40));
        refresh.setPreferredSize(new Dimension(120, 40));

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.RIGHT, 12, 5));
        buttons.setBackground(new Color(235, 242, 250));
        buttons.add(add);
        buttons.add(delete);
        buttons.add(refresh);

        mainPanel.add(title, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(buttons, BorderLayout.SOUTH);

        add(mainPanel);

        add.addActionListener(e -> addVehicle());
        delete.addActionListener(e -> deleteVehicle());
        refresh.addActionListener(e -> refreshTable());
    }

    private void refreshTable() {
        model.setRowCount(0);

        for (Vehicle v : AppData.vehicles) {
            model.addRow(new Object[]{
                v.getVehicleName(),
                v.getVehicleNumber(),
                v.getType(),
                v.getRentPerDay(),
                v.isAvailable() ? "Yes" : "No"
            });
        }
    }

    private void addVehicle() {
        JTextField name = new JTextField();
        JTextField number = new JTextField();
        JTextField type = new JTextField();
        JTextField rent = new JTextField();

        Object[] fields = {
            "Vehicle Name:", name,
            "Vehicle Number:", number,
            "Vehicle Type:", type,
            "Rent Per Day:", rent
        };

        int result = JOptionPane.showConfirmDialog(
                this, fields, "Add Vehicle",
                JOptionPane.OK_CANCEL_OPTION);

        if (result != JOptionPane.OK_OPTION) {
            return;
        }

        if (name.getText().trim().isEmpty()
                || number.getText().trim().isEmpty()
                || type.getText().trim().isEmpty()
                || rent.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Fill all fields.");
            return;
        }

        double amount;

        try {
            amount = Double.parseDouble(rent.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Enter a valid rent amount.");
            return;
        }

        if (amount <= 0) {
            JOptionPane.showMessageDialog(this,
                    "Rent must be greater than zero.");
            return;
        }

        for (Vehicle v : AppData.vehicles) {
            if (v.getVehicleNumber().equalsIgnoreCase(
                    number.getText().trim())) {
                JOptionPane.showMessageDialog(this,
                        "Vehicle number already exists.");
                return;
            }
        }

        AppData.vehicles.add(new Vehicle(
                name.getText().trim(),
                number.getText().trim(),
                type.getText().trim(),
                amount));

        refreshTable();
        JOptionPane.showMessageDialog(this,
                "Vehicle added successfully.");
    }

    private void deleteVehicle() {
        int row = table.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(this,
                    "Select a vehicle first.");
            return;
        }

        String number = model.getValueAt(row, 1).toString();

        for (Vehicle v : AppData.vehicles) {
            if (v.getVehicleNumber().equals(number)) {
                boolean booked = false;

                for (Booking b : AppData.bookings) {
                    if (b.getVehicle() == v
                            && !b.getStatus().equals("Cancelled")) {
                        booked = true;
                        break;
                    }
                }

                if (booked) {
                    JOptionPane.showMessageDialog(this,
                            "This vehicle has booking records and cannot be deleted.");
                    return;
                }

                AppData.vehicles.remove(v);
                refreshTable();
                JOptionPane.showMessageDialog(this,
                        "Vehicle deleted.");
                return;
            }
        }
    }
}
