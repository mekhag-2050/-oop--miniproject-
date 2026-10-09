package rental.system;

import javax.swing.*;
import java.awt.*;

public class VehicleManagementFrame extends JFrame {

    public VehicleManagementFrame() {

        setTitle("Vehicle Management");
        setSize(600, 550);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Title
        JLabel title = new JLabel(
                "VEHICLE MANAGEMENT",
                SwingConstants.CENTER);

        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title, BorderLayout.NORTH);

        // Form Panel
        JPanel formPanel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 10, 8, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Model Name
        JLabel l1 = new JLabel("Model Name:");
        JTextField t1 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        formPanel.add(l1, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t1, gbc);

        // Registration Number
        JLabel l2 = new JLabel("Registration No:");
        JTextField t2 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0;
        formPanel.add(l2, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t2, gbc);

        // Category
        JLabel l3 = new JLabel("Category:");

        JComboBox<String> c1 = new JComboBox<>(
                new String[]{
                        "Car",
                        "Bike"
                });

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0;
        formPanel.add(l3, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(c1, gbc);

        // Fuel Type
        JLabel l4 = new JLabel("Fuel Type:");

        JComboBox<String> c2 = new JComboBox<>(
                new String[]{
                        "Petrol",
                        "Diesel",
                        "Electric"
                });

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0;
        formPanel.add(l4, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(c2, gbc);

        // Daily Rate
        JLabel l5 = new JLabel("Daily Rate:");
        JTextField t3 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 0;
        formPanel.add(l5, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t3, gbc);

        // Status
        JLabel l6 = new JLabel("Status:");

        JComboBox<String> c3 = new JComboBox<>(
                new String[]{
                        "Available",
                        "Rented",
                        "Maintenance"
                });

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.weightx = 0;
        formPanel.add(l6, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(c3, gbc);

        add(formPanel, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel(
                new FlowLayout(FlowLayout.CENTER, 15, 10));

        JButton b1 = new JButton("Add Vehicle");
        JButton b2 = new JButton("Update");
        JButton b3 = new JButton("Delete");
        JButton b4 = new JButton("Clear");

        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);
        buttonPanel.add(b4);

        // Information
        JLabel info = new JLabel(
                "Each registration number represents one physical vehicle.",
                SwingConstants.CENTER);

        JPanel bottomPanel = new JPanel(new BorderLayout());

        bottomPanel.add(buttonPanel, BorderLayout.NORTH);
        bottomPanel.add(info, BorderLayout.SOUTH);

        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new VehicleManagementFrame();
    }
}
