package rental.system;

import javax.swing.*;
import java.awt.*;

public class AdminDashboardFrame extends JFrame {
    public AdminDashboardFrame() {
        setTitle("Smart Vehicle Rental System - Admin Dashboard");
        setSize(900, 600);
        setMinimumSize(new Dimension(650, 500));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main background
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(new Color(235, 242, 250));

        // Dashboard card
        JPanel panel = new JPanel(new GridLayout(5, 1, 15, 15));
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(
                        new Color(210, 220, 235), 1),
                BorderFactory.createEmptyBorder(30, 40, 30, 40)
        ));
        panel.setPreferredSize(new Dimension(450, 430));

        JLabel title = new JLabel("ADMIN DASHBOARD", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(new Color(25, 65, 115));

        JButton vehicles = new JButton("Vehicle Management");
        JButton bookings = new JButton("Booking Management");
        JButton customers = new JButton("Customer Management");
        JButton logout = new JButton("Logout");

        JButton[] buttons = {
            vehicles, bookings, customers, logout
        };

        for (JButton button : buttons) {
            button.setFont(new Font("Arial", Font.BOLD, 15));
            button.setFocusPainted(false);
            button.setPreferredSize(new Dimension(330, 45));
        }

        vehicles.setBackground(new Color(35, 100, 180));
        vehicles.setForeground(Color.WHITE);

        bookings.setBackground(new Color(225, 237, 250));
        bookings.setForeground(new Color(25, 65, 115));

        customers.setBackground(new Color(225, 237, 250));
        customers.setForeground(new Color(25, 65, 115));

        logout.setBackground(new Color(190, 55, 55));
        logout.setForeground(Color.WHITE);

        panel.add(title);
        panel.add(vehicles);
        panel.add(bookings);
        panel.add(customers);
        panel.add(logout);

        mainPanel.add(panel);
        add(mainPanel, BorderLayout.CENTER);

        vehicles.addActionListener(e ->
                new VehicleManagementFrame().setVisible(true));

        bookings.addActionListener(e ->
                new BookingManagementFrame().setVisible(true));

        customers.addActionListener(e ->
                new CustomerManagementFrame().setVisible(true));

        logout.addActionListener(e -> {
            new LoginFrame().setVisible(true);
            dispose();
        });
    }
}
