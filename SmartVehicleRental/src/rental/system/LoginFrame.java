package rental.system;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {
    JTextField emailField;
    JPasswordField passwordField;

    public LoginFrame() {
        setTitle("Smart Vehicle Rental System - Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));

        JLabel title = new JLabel("VEHICLE RENTAL LOGIN", JLabel.CENTER);
        emailField = new JTextField();
        passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Register");
        JButton adminButton = new JButton("Admin Login");

        panel.add(title);
        panel.add(emailField);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(registerButton);

        add(panel, BorderLayout.CENTER);
        add(adminButton, BorderLayout.SOUTH);

        emailField.setBorder(BorderFactory.createTitledBorder("Email"));
        passwordField.setBorder(BorderFactory.createTitledBorder("Password"));

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

        JOptionPane.showMessageDialog(this,
                "Invalid email or password.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }
            }
