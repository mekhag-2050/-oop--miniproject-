package rental.system;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class VehicleManagementFrame extends JFrame {
    DefaultTableModel model;
    JTable table;

    public VehicleManagementFrame() {
        setTitle("Vehicle Management");
        setSize(750, 400);
        setLocationRelativeTo(null);

        model = new DefaultTableModel(
                new String[]{"Name", "Number", "Type", "Rent", "Available"}, 0);

        table = new JTable(model);
        refreshTable();

        JButton add = new JButton("Add Vehicle");
        JButton delete = new JButton("Delete Vehicle");
        JButton refresh = new JButton("Refresh");

        JPanel buttons = new JPanel();
        buttons.add(add);
        buttons.add(delete);
        buttons.add(refresh);

        add(new JScrollPane(table), BorderLayout.CENTER);
        add(buttons, BorderLayout.SOUTH);

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
