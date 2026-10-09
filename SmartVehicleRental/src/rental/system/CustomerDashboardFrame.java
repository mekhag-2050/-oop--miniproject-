package rental.system;

import javax.swing.*;
import java.awt.*;

public class CustomerDashboardFrame extends JFrame {

    public CustomerDashboardFrame() {

        setTitle("Customer Dashboard");
        setSize(500, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main Layout
        setLayout(new BorderLayout(10, 10));

        // ==============================
        // TITLE - NORTH
        // ==============================

        JLabel title = new JLabel(
                "CUSTOMER DASHBOARD",
                SwingConstants.CENTER);

        title.setFont(new Font("Arial", Font.BOLD, 18));

        add(title, BorderLayout.NORTH);

        // ==============================
        // CENTER
        // ==============================

        JPanel centerPanel = new JPanel(
                new BorderLayout(10, 15));

        JLabel welcome = new JLabel(
                "Welcome to Smart Vehicle Rental",
                SwingConstants.CENTER);

        welcome.setFont(new Font("Arial", Font.PLAIN, 15));

        centerPanel.add(welcome, BorderLayout.NORTH);

        // ==============================
        // DASHBOARD BUTTONS
        // ==============================

        JPanel buttonPanel = new JPanel(
                new GridLayout(3, 2, 15, 15));

        JButton b1 = new JButton("Available Vehicles");
        JButton b2 = new JButton("Book Vehicle");
        JButton b3 = new JButton("My Bookings");
        JButton b4 = new JButton("My Bill");
        JButton b5 = new JButton("My Profile");
        JButton b6 = new JButton("Rental History");

        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(b4);
        buttonPanel.add(b5);
        buttonPanel.add(b6);

        centerPanel.add(buttonPanel, BorderLayout.CENTER);

        add(centerPanel, BorderLayout.CENTER);

        // ==============================
        // LOGOUT - SOUTH
        // ==============================

        JPanel bottomPanel = new JPanel(new FlowLayout());

        JButton logoutButton = new JButton("Logout");

        bottomPanel.add(logoutButton);

        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CustomerDashboardFrame();
    }
            }
