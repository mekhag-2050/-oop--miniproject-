package rental.system;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class BookingManagementFrame extends JFrame {
    DefaultTableModel model;
    JTable table;

    public BookingManagementFrame() {
        setTitle("Booking Management");
        setSize(900, 600);
        setMinimumSize(new Dimension(650, 450));
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout(15, 15));
        mainPanel.setBackground(new Color(235, 242, 250));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Booking Management");
        title.setFont(new Font("Arial", Font.BOLD, 25));
        title.setForeground(new Color(25, 65, 115));
        title.setBorder(BorderFactory.createEmptyBorder(5, 5, 10, 5));

        model = new DefaultTableModel(
                new String[]{"Customer", "Vehicle", "Days",
                    "Amount", "Status"}, 0);

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

        JButton cancel = new JButton("Cancel Booking");
        JButton refresh = new JButton("Refresh");

        cancel.setFont(new Font("Arial", Font.BOLD, 14));
        cancel.setBackground(new Color(190, 60, 60));
        cancel.setForeground(Color.WHITE);
        cancel.setFocusPainted(false);
        cancel.setPreferredSize(new Dimension(170, 40));

        refresh.setFont(new Font("Arial", Font.BOLD, 14));
        refresh.setBackground(new Color(35, 100, 180));
        refresh.setForeground(Color.WHITE);
        refresh.setFocusPainted(false);
        refresh.setPreferredSize(new Dimension(120, 40));

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.RIGHT, 12, 5));
        buttons.setBackground(new Color(235, 242, 250));
        buttons.add(cancel);
        buttons.add(refresh);

        mainPanel.add(title, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(buttons, BorderLayout.SOUTH);

        add(mainPanel);

        cancel.addActionListener(e -> cancelBooking());
        refresh.addActionListener(e -> refreshTable());
    }

    private void refreshTable() {
        model.setRowCount(0);

        for (Booking b : AppData.bookings) {
            model.addRow(new Object[]{
                b.getCustomer().getName(),
                b.getVehicle().getVehicleName(),
                b.getDays(),
                b.getTotalAmount(),
                b.getStatus()
            });
        }
    }

    private void cancelBooking() {
        int row = table.getSelectedRow();

        if (row == -1) {
            JOptionPane.showMessageDialog(this,
                    "Select a booking first.");
            return;
        }

        Booking b = AppData.bookings.get(row);

        if (b.getStatus().equals("Cancelled")) {
            JOptionPane.showMessageDialog(this,
                    "This booking is already cancelled.");
            return;
        }

        b.setStatus("Cancelled");
        b.getVehicle().setAvailable(true);

        refreshTable();

        JOptionPane.showMessageDialog(this,
                "Booking cancelled.");
    }
}
