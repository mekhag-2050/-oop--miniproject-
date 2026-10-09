package rental.system;

import javax.swing.*;
import java.awt.*;

public class MyBookingsFrame extends JFrame {

    public MyBookingsFrame() {
        setTitle("My Bookings");
        setSize(550, 430);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Title
        JLabel title = new JLabel("MY BOOKINGS", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title, BorderLayout.NORTH);

        // Form Panel
        JPanel formPanel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 10, 8, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Booking ID
        JLabel l1 = new JLabel("Booking ID:");
        JTextField t1 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        formPanel.add(l1, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t1, gbc);

        // Vehicle
        JLabel l2 = new JLabel("Vehicle:");
        JTextField t2 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0;
        formPanel.add(l2, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t2, gbc);

        // Start Date
        JLabel l3 = new JLabel("Start Date:");
        JTextField t3 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0;
        formPanel.add(l3, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t3, gbc);

        // No. of Days
        JLabel l4 = new JLabel("No. of Days:");
        JTextField t4 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0;
        formPanel.add(l4, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t4, gbc);

        // Booking Status
        JLabel l5 = new JLabel("Booking Status:");
        JTextField t5 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 0;
        formPanel.add(l5, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t5, gbc);

        add(formPanel, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel(
                new FlowLayout(FlowLayout.CENTER, 15, 10));

        JButton b1 = new JButton("View Bill");
        JButton b2 = new JButton("Cancel Booking");
        JButton b3 = new JButton("Back");

        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyBookingsFrame();
    }
}
