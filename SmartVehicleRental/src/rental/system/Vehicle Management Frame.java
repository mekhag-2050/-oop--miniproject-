package rental.system;

import javax.swing.*;

public class VehicleManagementFrame extends JFrame {

    public VehicleManagementFrame() {

        setTitle("Vehicle Management");
        setSize(600, 550);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Title
        JLabel title = new JLabel("VEHICLE MANAGEMENT");
        title.setBounds(210, 20, 220, 25);
        add(title);

        // Model Name
        JLabel l1 = new JLabel("Model Name:");
        l1.setBounds(40, 70, 120, 25);
        add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(180, 70, 280, 25);
        add(t1);

        // Registration Number
        JLabel l2 = new JLabel("Registration No:");
        l2.setBounds(40, 110, 120, 25);
        add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(180, 110, 280, 25);
        add(t2);

        // Category
        JLabel l3 = new JLabel("Category:");
        l3.setBounds(40, 150, 120, 25);
        add(l3);

        JComboBox<String> c1 = new JComboBox<>(
                new String[]{
                    "Car",
                    "Bike"
                });

        c1.setBounds(180, 150, 280, 25);
        add(c1);

        // Fuel Type
        JLabel l4 = new JLabel("Fuel Type:");
        l4.setBounds(40, 190, 120, 25);
        add(l4);

        JComboBox<String> c2 = new JComboBox<>(
                new String[]{
                    "Petrol",
                    "Diesel",
                    "Electric"
                });

        c2.setBounds(180, 190, 280, 25);
        add(c2);

        // Daily Rate
        JLabel l5 = new JLabel("Daily Rate:");
        l5.setBounds(40, 230, 120, 25);
        add(l5);

        JTextField t3 = new JTextField();
        t3.setBounds(180, 230, 280, 25);
        add(t3);

        // Status
        JLabel l6 = new JLabel("Status:");
        l6.setBounds(40, 270, 120, 25);
        add(l6);

        JComboBox<String> c3 = new JComboBox<>(
                new String[]{
                    "Available",
                    "Rented",
                    "Maintenance"
                });

        c3.setBounds(180, 270, 280, 25);
        add(c3);

        // Add Vehicle Button
        JButton b1 = new JButton("Add Vehicle");
        b1.setBounds(50, 330, 140, 35);
        add(b1);

        // Update Button
        JButton b2 = new JButton("Update");
        b2.setBounds(210, 330, 120, 35);
        add(b2);

        // Delete Button
        JButton b3 = new JButton("Delete");
        b3.setBounds(350, 330, 120, 35);
        add(b3);

        // Clear Button
        JButton b4 = new JButton("Clear");
        b4.setBounds(210, 380, 120, 35);
        add(b4);

        // Information
        JLabel info = new JLabel(
                "Each registration number represents one physical vehicle.");

        info.setBounds(80, 440, 450, 25);
        add(info);
    }

    public static void main(String[] args) {
        new VehicleManagementFrame().setVisible(true);
    }
}
