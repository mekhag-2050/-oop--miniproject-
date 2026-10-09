package rental.system;

import javax.swing.*;
import java.awt.*;

public class BookingManagementFrame extends JFrame {

    public BookingManagementFrame() {

        setTitle("Booking Management");
        setSize(550, 430);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Title
        JLabel title = new JLabel(
                "BOOKING MANAGEMENT",
                SwingConstants.CENTER);

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

        // Customer
        JLabel l2 = new JLabel("Customer:");
        JTextField t2 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0;
        formPanel.add(l2, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t2, gbc);

        // Vehicle
        JLabel l3 = new JLabel("Vehicle:");
        JTextField t3 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0;
        formPanel.add(l3, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t3, gbc);

        // Start Date
        JLabel l4 = new JLabel("Start Date:");
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

        JComboBox<String> c1 = new JComboBox<>(
                new String[]{
                        "Confirmed",
                        "Pending",
                        "Cancelled",
                        "Completed"
                });

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 0;
        formPanel.add(l5, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(c1, gbc);

        add(formPanel, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel(
                new FlowLayout(FlowLayout.CENTER, 20, 10));

        JButton b1 = new JButton("Update Booking");
        JButton b2 = new JButton("Delete Booking");

        buttonPanel.add(b1);
        buttonPanel.add(b2);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new BookingManagementFrame();
    }
}
