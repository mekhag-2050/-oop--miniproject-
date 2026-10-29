package rental.system;

import javax.swing.*;
import java.awt.*;

public class AdminDashboardFrame extends JFrame {
    public AdminDashboardFrame() {
        setTitle("Admin Dashboard");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        JLabel title = new JLabel("ADMIN DASHBOARD", JLabel.CENTER);
        JButton vehicles = new JButton("Vehicle Management");
        JButton bookings = new JButton("Booking Management");
        JButton customers = new JButton("Customer Management");
        JButton logout = new JButton("Logout");

        panel.add(title);
        panel.add(vehicles);
        panel.add(bookings);
        panel.add(customers);
        panel.add(logout);

        add(panel);

        vehicles.addActionListener(e ->
                new VehicleManagementFrame().setVisible(true));

        bookings.addActionListener(e ->
                new BookingManagementFrame().setVisible(true));

        customers.addActionListener(e ->
                new CustomerManagementFrame().setVisible(true));

        logout.addActionListener(e -> {
            new LoginFrame().setVisible(true);
            dispose();
        });
    }
}
