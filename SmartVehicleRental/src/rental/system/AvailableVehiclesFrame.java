package rental.system;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class AvailableVehiclesFrame extends JFrame {
    JTable table;
    DefaultTableModel model;

    public AvailableVehiclesFrame() {
        setTitle("Available Vehicles");
        setSize(700, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        model = new DefaultTableModel(
                new String[]{"Name", "Number", "Type", "Rent/Day", "Available"}, 0);
        table = new JTable(model);

        refreshTable();

        JButton details = new JButton("View Details");
        JButton back = new JButton("Back");

        JPanel buttons = new JPanel();
        buttons.add(details);
        buttons.add(back);

        add(new JScrollPane(table), BorderLayout.CENTER);
        add(buttons, BorderLayout.SOUTH);

        details.addActionListener(e -> showDetails());
        back.addActionListener(e -> {
            new CustomerDashboardFrame().setVisible(true);
            dispose();
        });
    }

    private void refreshTable() {
        model.setRowCount(0);

        for (Vehicle v : AppData.vehicles) {
            if (v.isAvailable()) {
                model.addRow(new Object[]{
                    v.getVehicleName(),
                    v.getVehicleNumber(),
                    v.getType(),
                    v.getRentPerDay(),
                    "Yes"
                });
            }
        }
    }

    private void showDetails() {
        int row = table.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(this,
                    "Select a vehicle first.");
            return;
        }

        String number = model.getValueAt(row, 1).toString();

        for (Vehicle v : AppData.vehicles) {
            if (v.getVehicleNumber().equals(number)) {
                new VehicleDetailsFrame(v).setVisible(true);
                dispose();
                return;
            }
        }
    }
    }
