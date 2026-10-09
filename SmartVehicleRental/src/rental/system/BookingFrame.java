package rental.system;

import javax.swing.*;
import java.awt.*;

public class BookingFrame extends JFrame {

    public BookingFrame() {

        setTitle("Book Vehicle");
        setSize(550, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main Layout
        setLayout(new BorderLayout(10, 10));

        // ==============================
        // TITLE - NORTH
        // ==============================

        JLabel title = new JLabel(
                "BOOK VEHICLE",
                SwingConstants.CENTER);

        title.setFont(new Font("Arial", Font.BOLD, 16));

        add(title, BorderLayout.NORTH);

        // ==============================
        // FORM - CENTER
        // ==============================

        JPanel formPanel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(8, 10, 8, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Vehicle Model
        JLabel l1 = new JLabel("Vehicle Model:");
        JLabel model = new JLabel("Honda City");

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        formPanel.add(l1, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(model, gbc);

        // Registration Number
        JLabel l2 = new JLabel("Registration No:");
        JLabel registration = new JLabel("KL 01 AB 1234");

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0;
        formPanel.add(l2, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(registration, gbc);

        // Start Date
        JLabel l3 = new JLabel("Start Date:");
        JTextField startDate = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(l3, gbc);

        gbc.gridx = 1;
        formPanel.add(startDate, gbc);

        // Number of Days
        JLabel l4 = new JLabel("No. of Days:");
        JTextField days = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(l4, gbc);

        gbc.gridx = 1;
        formPanel.add(days, gbc);

        // Daily Rate
        JLabel l5 = new JLabel("Daily Rate:");
        JLabel rate = new JLabel("₹2,000");

        gbc.gridx = 0;
        gbc.gridy = 4;
        formPanel.add(l5, gbc);

        gbc.gridx = 1;
        formPanel.add(rate, gbc);

        // Total Amount
        JLabel l6 = new JLabel("Total Amount:");
        JLabel total = new JLabel("₹0");

        gbc.gridx = 0;
        gbc.gridy = 5;
        formPanel.add(l6, gbc);

        gbc.gridx = 1;
        formPanel.add(total, gbc);

        add(formPanel, BorderLayout.CENTER);

        // ==============================
        // BUTTONS - SOUTH
        // ==============================

        JPanel buttonPanel = new JPanel(
                new FlowLayout(
                        FlowLayout.CENTER, 10, 10));

        JButton calculateButton =
                new JButton("Calculate & Book");

        JButton paymentButton =
                new JButton("Proceed to Payment");

        JButton backButton =
                new JButton("Back");

        buttonPanel.add(calculateButton);
        buttonPanel.add(paymentButton);
        buttonPanel.add(backButton);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new BookingFrame();
    }
}
