package rental.system;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MyBookingsFrame extends JFrame {
    DefaultTableModel model;

    public MyBookingsFrame() {
        setTitle("Smart Vehicle Rental System - My Bookings");
        setSize(900, 600);
        setMinimumSize(new Dimension(650, 450));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout(15, 15));
        mainPanel.setBackground(new Color(235, 242, 250));
        mainPanel.setBorder(
                BorderFactory.createEmptyBorder(20, 25, 20, 25));

        JLabel title = new JLabel("MY BOOKINGS", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(new Color(25, 65, 115));

        model = new DefaultTableModel(
                new String[]{"Vehicle", "Days", "Amount", "Status"}, 0);

        JTable table = new JTable(model);
        table.setFont(new Font("Arial", Font.PLAIN, 14));
        table.setRowHeight(32);
        table.setFillsViewportHeight(true);
        table.setSelectionMode(
                ListSelectionModel.SINGLE_SELECTION);
        table.setGridColor(new Color(220, 228, 238));

        table.getTableHeader().setFont(
                new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setBackground(
                new Color(35, 100, 180));
        table.getTableHeader().setForeground(Color.WHITE);
        table.getTableHeader().setPreferredSize(
                new Dimension(0, 38));

        for (Booking b : AppData.bookings) {
            if (b.getCustomer() == AppData.loggedInCustomer) {
                model.addRow(new Object[]{
                    b.getVehicle().getVehicleName(),
                    b.getDays(),
                    b.getTotalAmount(),
                    b.getStatus()
                });
            }
        }

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createLineBorder(
                new Color(210, 220, 235)));

        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.setBackground(Color.WHITE);
        tablePanel.setBorder(
                BorderFactory.createEmptyBorder(5, 5, 5, 5));
        tablePanel.add(scrollPane, BorderLayout.CENTER);

        JButton close = new JButton("Close");
        close.setFont(new Font("Arial", Font.BOLD, 14));
        close.setBackground(new Color(35, 100, 180));
        close.setForeground(Color.WHITE);
        close.setFocusPainted(false);
        close.setPreferredSize(new Dimension(140, 40));

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(235, 242, 250));
        bottomPanel.add(close);

        mainPanel.add(title, BorderLayout.NORTH);
        mainPanel.add(tablePanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        add(mainPanel);

        close.addActionListener(e -> dispose());
    }
}
