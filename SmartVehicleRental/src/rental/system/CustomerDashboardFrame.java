package rental.system;

import javax.swing.*;
import java.awt.*;

public class CustomerDashboardFrame extends JFrame {

    public CustomerDashboardFrame() {
        setTitle("Customer Dashboard");
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel title = new JLabel(
                "CUSTOMER DASHBOARD",
                SwingConstants.CENTER);
        title.setBounds(50, 25, 400, 30);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title);

        JLabel welcome = new JLabel(
                "Welcome to Smart Vehicle Rental",
                SwingConstants.CENTER);
        welcome.setBounds(80, 65, 340, 25);
        add(welcome);

        JButton b1 = new JButton("Available Vehicles");
        b1.setBounds(150, 110, 200, 35);
        add(b1);

        JButton b2 = new JButton("Book Vehicle");
        b2.setBounds(150, 160, 200, 35);
        add(b2);

        JButton b3 = new JButton("My Bookings");
        b3.setBounds(150, 210, 200, 35);
        add(b3);

        JButton b4 = new JButton("My Bill");
        b4.setBounds(150, 260, 200, 35);
        add(b4);

        JButton b5 = new JButton("My Profile");
        b5.setBounds(150, 310, 200, 35);
        add(b5);

        JButton b6 = new JButton("Rental History");
        b6.setBounds(150, 360, 200, 35);
        add(b6);
    }

    public static void main(String[] args) {
        new CustomerDashboardFrame().setVisible(true);
    }
}
