package rental.system;

import javax.swing.*;
import java.awt.*;

public class CustomerDashboardFrame extends JFrame {
    public CustomerDashboardFrame() {
        setTitle("Smart Vehicle Rental System - Customer Dashboard");
        setSize(900, 600);
        setMinimumSize(new Dimension(650, 500));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main background
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(new Color(235, 242, 250));

        // Dashboard card
        JPanel panel = new JPanel(new GridLayout(6, 1, 12, 12));
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(
                        new Color(210, 220, 235), 1),
                BorderFactory.createEmptyBorder(30, 40, 30, 40)
        ));
        panel.setPreferredSize(new Dimension(430, 480));

        JLabel welcome = new JLabel(
                "Welcome, " + AppData.loggedInCustomer.getName(),
                JLabel.CENTER);
        welcome.setFont(new Font("Arial", Font.BOLD, 22));
        welcome.setForeground(new Color(25, 65, 115));

        JButton vehicles = new JButton("Available Vehicles");
        JButton profile = new JButton("My Profile");
        JButton bookings = new JButton("My Bookings");
        JButton history = new JButton("Rental History");
        JButton logout = new JButton("Logout");

        JButton[] buttons = {
            vehicles, profile, bookings, history, logout
        };

        for (JButton button : buttons) {
            button.setFont(new Font("Arial", Font.BOLD, 15));
            button.setFocusPainted(false);
            button.setPreferredSize(new Dimension(330, 45));
        }

        vehicles.setBackground(new Color(35, 100, 180));
        vehicles.setForeground(Color.WHITE);

        profile.setBackground(new Color(225, 237, 250));
        profile.setForeground(new Color(25, 65, 115));

        bookings.setBackground(new Color(225, 237, 250));
        bookings.setForeground(new Color(25, 65, 115));

        history.setBackground(new Color(225, 237, 250));
        history.setForeground(new Color(25, 65, 115));

        logout.setBackground(new Color(190, 55, 55));
        logout.setForeground(Color.WHITE);

        panel.add(welcome);
        panel.add(vehicles);
        panel.add(profile);
        panel.add(bookings);
        panel.add(history);
        panel.add(logout);

        // Center dashboard while background fills the window
        mainPanel.add(panel);
        add(mainPanel, BorderLayout.CENTER);

        vehicles.addActionListener(e -> {
            new AvailableVehiclesFrame().setVisible(true);
            dispose();
        });

        profile.addActionListener(e ->
                new CustomerProfileFrame().setVisible(true));

        bookings.addActionListener(e ->
                new MyBookingsFrame().setVisible(true));

        history.addActionListener(e ->
                new RentalHistoryFrame().setVisible(true));

        logout.addActionListener(e -> {
            AppData.loggedInCustomer = null;
            new LoginFrame().setVisible(true);
            dispose();
        });
    }
        }
