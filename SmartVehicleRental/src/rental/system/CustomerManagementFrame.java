package rental.system;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class CustomerManagementFrame extends JFrame {
    DefaultTableModel model;
    JTable table;

    public CustomerManagementFrame() {
        setTitle("Customer Management");
        setSize(700, 400);
        setLocationRelativeTo(null);

        model = new DefaultTableModel(
                new String[]{"Name", "Email", "Phone"}, 0);

        table = new JTable(model);
        refreshTable();

        JButton delete = new JButton("Delete Customer");
        JButton refresh = new JButton("Refresh");

        JPanel buttons = new JPanel();
        buttons.add(delete);
        buttons.add(refresh);

        add(new JScrollPane(table), BorderLayout.CENTER);
        add(buttons, BorderLayout.SOUTH);

        delete.addActionListener(e -> deleteCustomer());
        refresh.addActionListener(e -> refreshTable());
    }

    private void refreshTable() {
        model.setRowCount(0);

        for (Customer c : AppData.customers) {
            model.addRow(new Object[]{
                c.getName(),
                c.getEmail(),
                c.getPhone()
            });
        }
    }

    private void deleteCustomer() {
        int row = table.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(this,
                    "Select a customer first.");
            return;
        }

        String email = model.getValueAt(row, 1).toString();

        for (Customer c : AppData.customers) {
            if (c.getEmail().equalsIgnoreCase(email)) {
                boolean hasBooking = false;

                for (Booking b : AppData.bookings) {
                    if (b.getCustomer() == c
                            && !b.getStatus().equals("Cancelled")) {
                        hasBooking = true;
                        break;
                    }
                }

                if (hasBooking) {
                    JOptionPane.showMessageDialog(this,
                            "Cannot delete a customer with active booking records.");
                    return;
                }

                AppData.customers.remove(c);
                refreshTable();

                JOptionPane.showMessageDialog(this,
                        "Customer deleted.");
                return;
            }
        }
    }
}
