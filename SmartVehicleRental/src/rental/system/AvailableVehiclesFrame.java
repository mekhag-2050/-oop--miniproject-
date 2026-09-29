package rental.system;

import javax.swing.*;

public class AvailableVehiclesFrame extends JFrame {

    public AvailableVehiclesFrame() {

        setTitle("Available Vehicles");
        setSize(650, 550);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Title
        JLabel title = new JLabel("AVAILABLE VEHICLES");
        title.setBounds(230, 20, 200, 25);
        add(title);

        // Search Vehicle
        JLabel l1 = new JLabel("Search Vehicle:");
        l1.setBounds(40, 70, 120, 25);
        add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(160, 70, 300, 25);
        add(t1);

        JButton b1 = new JButton("Search");
        b1.setBounds(475, 70, 100, 25);
        add(b1);

        // Search Results
        JLabel l2 = new JLabel("Search Results:");
        l2.setBounds(40, 120, 150, 25);
        add(l2);

        // Vehicle Model
        JLabel l3 = new JLabel("Vehicle Model:");
        l3.setBounds(40, 160, 120, 25);
        add(l3);

        JLabel model = new JLabel("Honda City");
        model.setBounds(170, 160, 250, 25);
        add(model);

        // Registration Number
        JLabel l4 = new JLabel("Registration No:");
        l4.setBounds(40, 200, 120, 25);
        add(l4);

        JComboBox<String> registrationBox = new JComboBox<>(
                new String[]{
                    "KL 01 AB 1234",
                    "KL 01 CD 5678"
                });

        registrationBox.setBounds(170, 200, 250, 25);
        add(registrationBox);

        // Daily Rate
        JLabel l5 = new JLabel("Daily Rate:");
        l5.setBounds(40, 240, 120, 25);
        add(l5);

        JLabel rate = new JLabel("₹2,000");
        rate.setBounds(170, 240, 250, 25);
        add(rate);

        // Status
        JLabel l6 = new JLabel("Status:");
        l6.setBounds(40, 280, 120, 25);
        add(l6);

        JLabel status = new JLabel("Available");
        status.setBounds(170, 280, 250, 25);
        add(status);

        // Information
        JLabel info = new JLabel(
                "Select the registration number you want to book.");

        info.setBounds(40, 325, 400, 25);
        add(info);

        // View Details
        JButton b2 = new JButton("View Details");
        b2.setBounds(80, 380, 140, 35);
        add(b2);

        // Book Vehicle
        JButton b3 = new JButton("Book Vehicle");
        b3.setBounds(240, 380, 140, 35);
        add(b3);

        // Back
        JButton b4 = new JButton("Back");
        b4.setBounds(400, 380, 100, 35);
        add(b4);
    }

    public static void main(String[] args) {
        new AvailableVehiclesFrame().setVisible(true);
    }
}
