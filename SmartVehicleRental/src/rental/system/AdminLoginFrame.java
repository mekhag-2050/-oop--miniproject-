package rental.system;
import javax.swing.*;
import java.awt.*;

public class AdminLoginFrame extends JFrame {
    JTextField usernameField;
    JPasswordField passwordField;

    public AdminLoginFrame() {
        setTitle("Admin Login");
        setSize(350, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 1, 10, 10));

        usernameField = new JTextField();
        passwordField = new JPasswordField();

        usernameField.setBorder(
                BorderFactory.createTitledBorder("Username"));
        passwordField.setBorder(
                BorderFactory.createTitledBorder("Password"));

        JButton login = new JButton("Login");
        JButton back = new JButton("Back");

        add(usernameField);
        add(passwordField);
        add(login);
        add(back);

        login.addActionListener(e -> {
            String username = usernameField.getText().trim();
            String password = new String(passwordField.getPassword());

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
