package rental.system;

import javax.swing.*;
import java.awt.*;

public class AdminLoginFrame extends JFrame {
    JTextField usernameField;
    JPasswordField passwordField;

    public AdminLoginFrame() {
        setTitle("Smart Vehicle Rental System - Admin Login");
        setSize(750, 500);
        setMinimumSize(new Dimension(550, 400));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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
        panel.setPreferredSize(new Dimension(420, 340));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(12, 10, 12, 10);

        JLabel title = new JLabel("ADMIN LOGIN", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(new Color(25, 65, 115));

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        usernameField.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordField.setFont(new Font("Arial", Font.PLAIN, 15));

        usernameField.setPreferredSize(new Dimension(300, 42));
        passwordField.setPreferredSize(new Dimension(300, 42));

        usernameField.setBorder(
                BorderFactory.createTitledBorder("Username"));
        passwordField.setBorder(
                BorderFactory.createTitledBorder("Password"));

        JButton login = new JButton("Login");
        JButton back = new JButton("Back");

        login.setFont(new Font("Arial", Font.BOLD, 15));
        login.setBackground(new Color(35, 100, 180));
        login.setForeground(Color.WHITE);
        login.setFocusPainted(false);
        login.setPreferredSize(new Dimension(180, 42));

        back.setFont(new Font("Arial", Font.PLAIN, 14));
        back.setBackground(new Color(225, 237, 250));
        back.setForeground(new Color(25, 65, 115));
        back.setFocusPainted(false);
        back.setPreferredSize(new Dimension(180, 42));

        gbc.gridy = 0;
        panel.add(title, gbc);

        gbc.gridy = 1;
        panel.add(usernameField, gbc);

        gbc.gridy = 2;
        panel.add(passwordField, gbc);

        gbc.gridy = 3;
        panel.add(login, gbc);

        gbc.gridy = 4;
        panel.add(back, gbc);

        mainPanel.add(panel);
        add(mainPanel, BorderLayout.CENTER);

        login.addActionListener(e -> {
            String username = usernameField.getText().trim();
            String password =
                    new String(passwordField.getPassword());

            if (username.equals("admin")
                    && password.equals("admin123")) {
                new AdminDashboardFrame().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this,
                        "Invalid admin username or password.");
            }
        });

        back.addActionListener(e -> {
            new LoginFrame().setVisible(true);
            dispose();
        });
    }
}
