package rental.system;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    public LoginFrame() {

        setTitle("Login - Smart Vehicle Rental");
        setSize(400, 330);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main Layout
        setLayout(new BorderLayout(10, 10));

        // ==============================
        // TITLE - NORTH
        // ==============================

        JLabel title = new JLabel(
                "SMART VEHICLE RENTAL",
                SwingConstants.CENTER);

        title.setFont(new Font("Arial", Font.BOLD, 16));

        add(title, BorderLayout.NORTH);

        // ==============================
        // LOGIN FORM - CENTER
        // ==============================

        JPanel formPanel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(8, 10, 8, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Username
        JLabel l1 = new JLabel("Username:");
        JTextField t1 = new JTextField(15);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;

        formPanel.add(l1, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;

        formPanel.add(t1, gbc);

        // Password
        JLabel l2 = new JLabel("Password:");
        JPasswordField t2 = new JPasswordField(15);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0;

        formPanel.add(l2, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;

        formPanel.add(t2, gbc);

        add(formPanel, BorderLayout.CENTER);

        // ==============================
        // BOTTOM - SOUTH
        // ==============================

        JPanel bottomPanel = new JPanel();

        bottomPanel.setLayout(
                new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));

        // Login
        JPanel loginPanel = new JPanel(new FlowLayout());

        JButton b1 = new JButton("Login");

        loginPanel.add(b1);

        bottomPanel.add(loginPanel);

        // Register
        JPanel registerPanel = new JPanel(new FlowLayout());

        JLabel l3 = new JLabel("New customer?");
        JButton b2 = new JButton("Register");

        registerPanel.add(l3);
        registerPanel.add(b2);

        bottomPanel.add(registerPanel);

        // Admin
        JPanel adminPanel = new JPanel(new FlowLayout());

        JButton b3 = new JButton("Admin Login");

        adminPanel.add(b3);

        bottomPanel.add(adminPanel);

        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}
