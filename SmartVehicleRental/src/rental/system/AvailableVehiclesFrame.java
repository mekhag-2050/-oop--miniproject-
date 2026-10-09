package rental.system;

import javax.swing.*;
import java.awt.*;

public class AvailableVehiclesFrame extends JFrame {

    public AvailableVehiclesFrame() {

        setTitle("Available Vehicles");
        setSize(600, 550);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main Layout
        setLayout(new BorderLayout(10, 10));

        // ==============================
        // TITLE - NORTH
        // ==============================

        JLabel title = new JLabel(
                "AVAILABLE VEHICLES",
                SwingConstants.CENTER);

        title.setFont(new Font("Arial", Font.BOLD, 16));

        add(title, BorderLayout.NORTH);

        // ==============================
        // FORM - CENTER
        // ==============================

        JPanel formPanel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(8, 10, 8, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Search Vehicle
        JLabel l1 = new JLabel("Search Vehicle:");
        JTextField t1 = new JTextField(20);
        JButton searchButton = new JButton("Search");

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        formPanel.add(l1, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t1, gbc);

        gbc.gridx = 2;
        gbc.weightx = 0;
        formPanel.add(searchButton, gbc);

        // Vehicle Model
        JLabel l2 = new JLabel("Vehicle Model:");
        JLabel model = new JLabel("Honda City");

        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(l2, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        formPanel.add(model, gbc);

        gbc.gridwidth = 1;

        // Registration Number
        JLabel l3 = new JLabel("Registration No:");

        JComboBox<String> registrationBox =
                new JComboBox<>(
                        new String[]{
                                "KL 01 AB 1234",
                                "KL 01 CD 5678"
                        });

        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(l3, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        formPanel.add(registrationBox, gbc);

        gbc.gridwidth = 1;

        // Daily Rate
        JLabel l4 = new JLabel("Daily Rate:");
        JLabel rate = new JLabel("₹2,000");

        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(l4, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        formPanel.add(rate, gbc);

        gbc.gridwidth = 1;

        // Status
        JLabel l5 = new JLabel("Status:");
        JLabel status = new JLabel("Available");

        gbc.gridx = 0;
        gbc.gridy = 4;
        formPanel.add(l5, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        formPanel.add(status, gbc);

        gbc.gridwidth = 1;

        // Information
        JLabel info = new JLabel(
                "Select the registration number you want to book.");

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 3;

        formPanel.add(info, gbc);

        gbc.gridwidth = 1;

        add(formPanel, BorderLayout.CENTER);

        // ==============================
        // BUTTONS - SOUTH
        // ==============================

        JPanel buttonPanel = new JPanel(
                new FlowLayout(
                        FlowLayout.CENTER, 15, 10));

        JButton viewButton = new JButton("View Details");
        JButton bookButton = new JButton("Book Vehicle");
        JButton backButton = new JButton("Back");

        buttonPanel.add(viewButton);
        buttonPanel.add(bookButton);
        buttonPanel.add(backButton);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new AvailableVehiclesFrame();
    }
            }
