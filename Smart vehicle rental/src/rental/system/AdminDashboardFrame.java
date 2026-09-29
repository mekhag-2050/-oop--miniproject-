package rental.system;

import javax.swing.*;
import java.awt.*;

public class AdminDashboardFrame extends JFrame {

    public AdminDashboardFrame() {
        setTitle("Admin Dashboard");
        setSize(500, 450);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel title = new JLabel(
                "ADMIN DASHBOARD",
                SwingConstants.CENTER);
        title.setBounds(50, 25, 400, 30);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title);

        JButton b1 = new JButton("Manage Vehicles");
        b1.setBounds(150, 90, 200, 35);
        add(b1);

        JButton b2 = new JButton("Manage Bookings");
        b2.setBounds(150, 140, 200, 35);
        add(b2);

        JButton b3 = new JButton("Manage Customers");
        b3.setBounds(150, 190, 200, 35);
        add(b3);

        JButton b4 = new JButton("Logout");
        b4.setBounds(150, 250, 200, 35);
        add(b4);
    }

    public static void main(String[] args) {
        new AdminDashboardFrame().setVisible(true);
    }
}
