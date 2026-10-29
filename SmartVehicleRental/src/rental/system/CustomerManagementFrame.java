package rental.system;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class CustomerManagementFrame extends JFrame {
    DefaultTableModel model;
    JTable table;

    public CustomerManagementFrame() {
        setTitle("Customer Management");
        setSize(900, 600);
        setMinimumSize(new Dimension(650, 450));
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout(15, 15));
        mainPanel.setBackground(new Color(235, 242, 250));
        mainPanel.setBorder(
                BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Customer Management");
        title.setFont(new Font("Arial", Font.BOLD, 25));
        title.setForeground(new Color(25, 65, 115));
        title.setBorder(
                BorderFactory.createEmptyBorder(5, 5, 10, 5));

        model = new DefaultTableModel(
                new String[]{"Name", "Email", "Phone"}, 0);

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
        table.getTableHeader().setPreferredSize(
                new Dimension(0, 38));

        refreshTable();

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(
                BorderFactory.createLineBorder(
                        new Color(210, 220, 235)));

        JButton delete = new JButton("Delete Customer");
        JButton refresh = new JButton("Refresh");

        delete.setFont(new Font("Arial", Font.BOLD, 14));
        delete.setBackground(new Color(190, 60, 60));
        delete.setForeground(Color.WHITE);
        delete.setFocusPainted(false);
        delete.setPreferredSize(new Dimension(170, 40));

        refresh.setFont(new Font("Arial", Font.BOLD, 14));
        refresh.setBackground(new Color(35, 100, 180));
        refresh.setForeground(Color.WHITE);
        refresh.setFocusPainted(false);
        refresh.setPreferredSize(new Dimension(120, 40));

        JPanel buttons = new JPanel(
                new FlowLayout(FlowLayout.RIGHT, 12, 5));
        buttons.setBackground(new Color(235, 242, 250));
        buttons.add(delete);
        buttons.add(refresh);

        mainPanel.add(title, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(buttons, BorderLayout.SOUTH);

        add(mainPanel);

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
