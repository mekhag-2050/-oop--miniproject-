package rental.system;

import javax.swing.*;
import java.awt.*;

public class CustomerRegistrationFrame extends JFrame {

    public CustomerRegistrationFrame() {

        setTitle("Customer Registration");
        setSize(500, 470);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main Layout
        setLayout(new BorderLayout(10, 10));

        // ==============================
        // TITLE - NORTH
        // ==============================

        JLabel title = new JLabel(
                "CUSTOMER REGISTRATION",
                SwingConstants.CENTER);

        title.setFont(new Font("Arial", Font.BOLD, 16));

        add(title, BorderLayout.NORTH);

        // ==============================
        // FORM - CENTER
        // ==============================

        JPanel formPanel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(6, 10, 6, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Customer Name
        JLabel l1 = new JLabel("Customer Name:");
        JTextField t1 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        formPanel.add(l1, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t1, gbc);

        // Phone
        JLabel l2 = new JLabel("Phone No:");
        JTextField t2 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0;
        formPanel.add(l2, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t2, gbc);

        // Email
        JLabel l3 = new JLabel("Email:");
        JTextField t3 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0;
        formPanel.add(l3, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t3, gbc);

        // License
        JLabel l4 = new JLabel("License No:");
        JTextField t4 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0;
        formPanel.add(l4, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t4, gbc);

        // Address
        JLabel l5 = new JLabel("Address:");
        JTextField t5 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 0;
        formPanel.add(l5, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t5, gbc);

        // Username
        JLabel l6 = new JLabel("Username:");
        JTextField t6 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.weightx = 0;
        formPanel.add(l6, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t6, gbc);

        // Password
        JLabel l7 = new JLabel("Password:");
        JPasswordField t7 = new JPasswordField(20);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.weightx = 0;
        formPanel.add(l7, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t7, gbc);

        add(formPanel, BorderLayout.CENTER);

        // ==============================
        // BUTTONS - SOUTH
        // ==============================

        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton b1 = new JButton("Register");
        JButton b2 = new JButton("Back");

        buttonPanel.add(b1);
        buttonPanel.add(b2);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CustomerRegistrationFrame();
    }
        }
