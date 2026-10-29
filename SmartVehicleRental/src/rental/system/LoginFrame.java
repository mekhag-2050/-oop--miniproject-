package rental.system;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    JTextField emailField;
    JPasswordField passwordField;

    public LoginFrame() {
        setTitle("Smart Vehicle Rental System - Login");
        setSize(900, 600);
        setMinimumSize(new Dimension(650, 450));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main background
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(new Color(235, 242, 250));

        // Login card
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(
                        new Color(210, 220, 235), 1),
                BorderFactory.createEmptyBorder(30, 35, 30, 35)
        ));
        panel.setPreferredSize(new Dimension(420, 430));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1;
        gbc.insets = new Insets(8, 0, 8, 0);

        JLabel title = new JLabel("SMART VEHICLE RENTAL");
        title.setFont(new Font("Arial", Font.BOLD, 23));
        title.setForeground(new Color(25, 65, 115));
        title.setHorizontalAlignment(JLabel.CENTER);

        JLabel subtitle = new JLabel("Customer Login");
        subtitle.setFont(new Font("Arial", Font.PLAIN, 15));
        subtitle.setForeground(Color.GRAY);
        subtitle.setHorizontalAlignment(JLabel.CENTER);

        emailField = new JTextField();
        passwordField = new JPasswordField();

        emailField.setFont(new Font("Arial", Font.PLAIN, 16));
        passwordField.setFont(new Font("Arial", Font.PLAIN, 16));

        emailField.setPreferredSize(new Dimension(330, 42));
        passwordField.setPreferredSize(new Dimension(330, 42));

        emailField.setBorder(
                BorderFactory.createTitledBorder("Email"));
        passwordField.setBorder(
                BorderFactory.createTitledBorder("Password"));

        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Register");
        JButton adminButton = new JButton("Admin Login");

        loginButton.setFont(new Font("Arial", Font.BOLD, 16));
        registerButton.setFont(new Font("Arial", Font.PLAIN, 15));
        adminButton.setFont(new Font("Arial", Font.PLAIN, 14));

        loginButton.setBackground(new Color(35, 100, 180));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);

        registerButton.setBackground(new Color(225, 237, 250));
        registerButton.setForeground(new Color(25, 65, 115));
        registerButton.setFocusPainted(false);

        adminButton.setBackground(new Color(245, 245, 245));
        adminButton.setFocusPainted(false);

        loginButton.setPreferredSize(new Dimension(330, 42));
        registerButton.setPreferredSize(new Dimension(330, 42));
        adminButton.setPreferredSize(new Dimension(180, 38));

        gbc.gridy = 0;
        panel.add(title, gbc);

        gbc.gridy = 1;
        panel.add(subtitle, gbc);

        gbc.gridy = 2;
        panel.add(emailField, gbc);

        gbc.gridy = 3;
        panel.add(passwordField, gbc);

        gbc.gridy = 4;
        panel.add(loginButton, gbc);

        gbc.gridy = 5;
        panel.add(registerButton, gbc);

        gbc.gridy = 6;
        panel.add(adminButton, gbc);

        // Center the card and let the background fill the window
        mainPanel.add(panel);
        add(mainPanel, BorderLayout.CENTER);

        loginButton.addActionListener(e -> login());

        registerButton.addActionListener(e -> {
            new CustomerRegistrationFrame().setVisible(true);
            dispose();
        });

        adminButton.addActionListener(e -> {
            new AdminLoginFrame().setVisible(true);
            dispose();
        });
    }

    private void login() {
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());

        if (email.equals("admin") && password.equals("admin123")) {
            new AdminDashboardFrame().setVisible(true);
            dispose();
            return;
        }

        for (Customer c : AppData.customers) {
            if (c.getEmail().equalsIgnoreCase(email)
                    && c.checkPassword(password)) {
                AppData.loggedInCustomer = c;
                new CustomerDashboardFrame().setVisible(true);
                dispose();
                return;
            }
        }

        JOptionPane.showMessageDialog(
                this, "Invalid email or password.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }
        }
