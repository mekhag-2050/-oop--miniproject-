package rental.system;

import javax.swing.*;
import java.awt.*;

public class BookingFrame extends JFrame {
    Vehicle vehicle;
    JTextField daysField;

    public BookingFrame(Vehicle vehicle) {
        this.vehicle = vehicle;

        setTitle("Smart Vehicle Rental System - Vehicle Booking");
        setSize(750, 500);
        setMinimumSize(new Dimension(550, 400));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Main background
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(new Color(235, 242, 250));

        // Booking card
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(
                        new Color(210, 220, 235), 1),
                BorderFactory.createEmptyBorder(30, 35, 30, 35)
        ));
        panel.setPreferredSize(new Dimension(460, 340));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(12, 10, 12, 10);

        JLabel title = new JLabel("VEHICLE BOOKING", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(new Color(25, 65, 115));

        JLabel vehicleLabel = new JLabel(
                "Vehicle:  " + vehicle.getVehicleName());
        vehicleLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        vehicleLabel.setForeground(new Color(45, 55, 70));

        JLabel rentLabel = new JLabel(
                "Rent per day:  Rs. " + vehicle.getRentPerDay());
        rentLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        rentLabel.setForeground(new Color(45, 55, 70));

        daysField = new JTextField();
        daysField.setFont(new Font("Arial", Font.PLAIN, 15));
        daysField.setPreferredSize(new Dimension(300, 42));
        daysField.setBorder(
                BorderFactory.createTitledBorder("Number of days"));

        JButton book = new JButton("Confirm Booking");
        book.setFont(new Font("Arial", Font.BOLD, 15));
        book.setBackground(new Color(35, 100, 180));
        book.setForeground(Color.WHITE);
        book.setFocusPainted(false);
        book.setPreferredSize(new Dimension(250, 42));

        gbc.gridy = 0;
        panel.add(title, gbc);

        gbc.gridy = 1;
        panel.add(vehicleLabel, gbc);

        gbc.gridy = 2;
        panel.add(rentLabel, gbc);

        gbc.gridy = 3;
        panel.add(daysField, gbc);

        gbc.gridy = 4;
        panel.add(book, gbc);

        mainPanel.add(panel);
        add(mainPanel, BorderLayout.CENTER);

        book.addActionListener(e -> confirmBooking());
    }

    private void confirmBooking() {
        if (AppData.loggedInCustomer == null) {
            JOptionPane.showMessageDialog(this, "Please log in.");
            return;
        }

        int days;

        try {
            days = Integer.parseInt(daysField.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Enter a valid number of days.");
            return;
        }

        if (days <= 0) {
            JOptionPane.showMessageDialog(this,
                    "Days must be greater than zero.");
            return;
        }

        if (!vehicle.isAvailable()) {
            JOptionPane.showMessageDialog(this,
                    "This vehicle is no longer available.");
            return;
        }

        Booking booking = new Booking(
                AppData.loggedInCustomer, vehicle, days);

        AppData.bookings.add(booking);
        vehicle.setAvailable(false);

        JOptionPane.showMessageDialog(this,
                "Booking created. Total: Rs. "
                        + booking.getTotalAmount());

        new PaymentFrame(booking).setVisible(true);
        dispose();
    }
                               }
