package rental.system;

import javax.swing.*;
import java.awt.*;

public class AdminDashboardFrame extends JFrame {

    public AdminDashboardFrame() {
        setTitle("Admin Dashboard");
        setSize(500, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Title
        JLabel title = new JLabel(
                "ADMIN DASHBOARD",
                SwingConstants.CENTER);

        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title, BorderLayout.NORTH);

        // Button Panel
        JPanel buttonPanel = new JPanel(
                new GridLayout(4, 1, 10, 15));

        JButton b1 = new JButton("Manage Vehicles");
        JButton b2 = new JButton("Manage Bookings");
        JButton b3 = new JButton("Manage Customers");
        JButton b4 = new JButton("Logout");

        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(b4);

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new AdminDashboardFrame();
    }
}
