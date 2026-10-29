package rental.system;

import javax.swing.*;
import java.awt.*;

public class CustomerRegistrationFrame extends JFrame {
    JTextField nameField, emailField, phoneField;
    JPasswordField passwordField;

    public CustomerRegistrationFrame() {
        setTitle("Customer Registration");
        setSize(900, 600);
        setMinimumSize(new Dimension(650, 500));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main background
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(new Color(235, 242, 250));

        // Registration card
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(
                        new Color(210, 220, 235), 1),
                BorderFactory.createEmptyBorder(25, 35, 25, 35)
        ));
        panel.setPreferredSize(new Dimension(480, 470));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(9, 8, 9, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel title = new JLabel(
                "CUSTOMER REGISTRATION", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 23));
        title.setForeground(new Color(25, 65, 115));

        JLabel subtitle = new JLabel(
                "Create your rental account", JLabel.CENTER);
        subtitle.setFont(new Font("Arial", Font.PLAIN, 14));
        subtitle.setForeground(Color.GRAY);

        nameField = new JTextField();
        emailField = new JTextField();
        phoneField = new JTextField();
        passwordField = new JPasswordField();

        JTextField[] fields = {
            nameField, emailField, phoneField, passwordField
        };

        for (JTextField field : fields) {
            field.setFont(new Font("Arial", Font.PLAIN, 15));
            field.setPreferredSize(new Dimension(250, 38));
        }

        JButton register = new JButton("Register");
        JButton back = new JButton("Back to Login");

        register.setFont(new Font("Arial", Font.BOLD, 15));
        register.setBackground(new Color(35, 100, 180));
        register.setForeground(Color.WHITE);
        register.setFocusPainted(false);
        register.setPreferredSize(new Dimension(160, 40));

        back.setFont(new Font("Arial", Font.PLAIN, 14));
        back.setBackground(new Color(225, 237, 250));
        back.setForeground(new Color(25, 65, 115));
        back.setFocusPainted(false);
        back.setPreferredSize(new Dimension(160, 40));

        JLabel[] labels = {
            new JLabel("Name:"),
            new JLabel("Email:"),
            new JLabel("Phone:"),
            new JLabel("Password:")
        };

        for (JLabel label : labels) {
            label.setFont(new Font("Arial", Font.BOLD, 14));
            label.setForeground(new Color(45, 55, 70));
        }

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.weightx = 1;
        panel.add(title, gbc);

        gbc.gridy = 1;
        panel.add(subtitle, gbc);

        gbc.gridwidth = 1;
        gbc.weightx = 0;

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(labels[0], gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        panel.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0;
        panel.add(labels[1], gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        panel.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 0;
        panel.add(labels[2], gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        panel.add(phoneField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.weightx = 0;
        panel.add(labels[3], gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        panel.add(passwordField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.weightx = 1;
        panel.add(register, gbc);

        gbc.gridx = 1;
        panel.add(back, gbc);

        // Keep the registration card centered when maximized
        mainPanel.add(panel);
        add(mainPanel, BorderLayout.CENTER);

        register.addActionListener(e -> registerCustomer());

        back.addActionListener(e -> {
            new LoginFrame().setVisible(true);
            dispose();
        });
    }

    private void registerCustomer() {
        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String phone = phoneField.getText().trim();
        String password = new String(passwordField.getPassword());

        if (name.isEmpty() || email.isEmpty()
                || phone.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill all fields.");
            return;
        }

        for (Customer c : AppData.customers) {
            if (c.getEmail().equalsIgnoreCase(email)) {
                JOptionPane.showMessageDialog(this,
                        "Email already registered.");
                return;
            }
        }

        AppData.customers.add(
                new Customer(name, email, phone, password));

        JOptionPane.showMessageDialog(this,
                "Registration successful!");

        new LoginFrame().setVisible(true);
        dispose();
    }
    }
