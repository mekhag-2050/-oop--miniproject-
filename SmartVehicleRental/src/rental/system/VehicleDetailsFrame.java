package rental.system;

import javax.swing.*;
import java.awt.*;

public class VehicleDetailsFrame extends JFrame {

    public VehicleDetailsFrame() {

        setTitle("Vehicle Details");
        setSize(550, 500);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main Layout
        setLayout(new BorderLayout(10, 10));

        // ==============================
        // TITLE - NORTH
        // ==============================

        JLabel title = new JLabel(
                "VEHICLE DETAILS",
                SwingConstants.CENTER);

        title.setFont(new Font("Arial", Font.BOLD, 16));

        add(title, BorderLayout.NORTH);

        // ==============================
        // DETAILS - CENTER
        // ==============================

        JPanel formPanel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(8, 10, 8, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Vehicle Model
        JLabel l1 = new JLabel("Vehicle Model:");
        JLabel model = new JLabel("Honda City");

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        formPanel.add(l1, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(model, gbc);

        // Vehicle Type
        JLabel l2 = new JLabel("Vehicle Type:");
        JLabel type = new JLabel("Car");

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0;
        formPanel.add(l2, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(type, gbc);

        // Fuel Type
        JLabel l3 = new JLabel("Fuel Type:");
        JLabel fuel = new JLabel("Petrol");

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0;
        formPanel.add(l3, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(fuel, gbc);

        // Registration
        JLabel l4 = new JLabel("Registration No:");
        JLabel registration = new JLabel("KL 01 AB 1234");

        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(l4, gbc);

        gbc.gridx = 1;
        formPanel.add(registration, gbc);

        // Daily Rate
        JLabel l5 = new JLabel("Daily Rate:");
        JLabel rate = new JLabel("₹2,000");

        gbc.gridx = 0;
        gbc.gridy = 4;
        formPanel.add(l5, gbc);

        gbc.gridx = 1;
        formPanel.add(rate, gbc);

        // Status
        JLabel l6 = new JLabel("Status:");
        JLabel status = new JLabel("Available");

        gbc.gridx = 0;
        gbc.gridy = 5;
        formPanel.add(l6, gbc);

        gbc.gridx = 1;
        formPanel.add(status, gbc);

        add(formPanel, BorderLayout.CENTER);

        // ==============================
        // BUTTONS - SOUTH
        // ==============================

        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton b1 = new JButton("Book Vehicle");
        JButton b2 = new JButton("Back");

        buttonPanel.add(b1);
        buttonPanel.add(b2);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new VehicleDetailsFrame();
    }
            }
