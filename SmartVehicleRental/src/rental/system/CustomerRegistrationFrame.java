package rental.system;

import javax.swing.*;
import java.awt.*;

public class CustomerRegistrationFrame extends JFrame {
    JTextField nameField, emailField, phoneField;
    JPasswordField passwordField;

    public CustomerRegistrationFrame() {
        setTitle("Customer Registration");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        nameField = new JTextField();
        emailField = new JTextField();
        phoneField = new JTextField();
        passwordField = new JPasswordField();

        JButton register = new JButton("Register");
        JButton back = new JButton("Back to Login");

        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Email:"));
        panel.add(emailField);
        panel.add(new JLabel("Phone:"));
        panel.add(phoneField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(register);
        panel.add(back);

        add(panel);

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
