package rental.system;

import javax.swing.*;
import java.awt.*;

public class BillingFrame extends JFrame {

    public BillingFrame(Booking booking) {
        setTitle("Smart Vehicle Rental System - Rental Bill");
        setSize(750, 550);
        setMinimumSize(new Dimension(550, 450));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(new Color(235, 242, 250));

        JPanel billPanel = new JPanel(new GridBagLayout());
        billPanel.setBackground(Color.WHITE);
        billPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(
                        new Color(210, 220, 235), 1),
                BorderFactory.createEmptyBorder(25, 35, 25, 35)
        ));
        billPanel.setPreferredSize(new Dimension(480, 410));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(9, 10, 9, 10);

        JLabel title = new JLabel(
                "SMART VEHICLE RENTAL SYSTEM", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 21));
        title.setForeground(new Color(25, 65, 115));

        JLabel subtitle = new JLabel("RENTAL BILL", JLabel.CENTER);
        subtitle.setFont(new Font("Arial", Font.BOLD, 17));
        subtitle.setForeground(new Color(35, 100, 180));

        JLabel customer = new JLabel(
                "Customer:  " + booking.getCustomer().getName());
        JLabel vehicle = new JLabel(
                "Vehicle:  " + booking.getVehicle().getVehicleName());
        JLabel vehicleNo = new JLabel(
                "Vehicle No:  "
                        + booking.getVehicle().getVehicleNumber());
        JLabel days = new JLabel(
                "Rental Days:  " + booking.getDays());
        JLabel amount = new JLabel(
                "Total Amount:  Rs. " + booking.getTotalAmount());
        JLabel status = new JLabel(
                "Payment Status:  " + booking.getStatus());

        JLabel[] details = {
            customer, vehicle, vehicleNo, days, amount, status
        };

        for (JLabel detail : details) {
            detail.setFont(new Font("Arial", Font.PLAIN, 15));
            detail.setForeground(new Color(45, 55, 70));
            detail.setBorder(
                    BorderFactory.createEmptyBorder(4, 5, 4, 5));
        }

        amount.setFont(new Font("Arial", Font.BOLD, 17));
        amount.setForeground(new Color(35, 100, 180));

        JButton dashboardButton =
                new JButton("Back to Dashboard");
        dashboardButton.setFont(new Font("Arial", Font.BOLD, 14));
        dashboardButton.setBackground(new Color(35, 100, 180));
        dashboardButton.setForeground(Color.WHITE);
        dashboardButton.setFocusPainted(false);
        dashboardButton.setPreferredSize(
                new Dimension(220, 42));

        gbc.gridy = 0;
        billPanel.add(title, gbc);

        gbc.gridy = 1;
        billPanel.add(subtitle, gbc);

        gbc.gridy = 2;
        billPanel.add(customer, gbc);

        gbc.gridy = 3;
        billPanel.add(vehicle, gbc);

        gbc.gridy = 4;
        billPanel.add(vehicleNo, gbc);

        gbc.gridy = 5;
        billPanel.add(days, gbc);

        gbc.gridy = 6;
        billPanel.add(amount, gbc);

        gbc.gridy = 7;
        billPanel.add(status, gbc);

        gbc.gridy = 8;
        billPanel.add(dashboardButton, gbc);

        mainPanel.add(billPanel);
        add(mainPanel, BorderLayout.CENTER);

        dashboardButton.addActionListener(e -> {
            new CustomerDashboardFrame().setVisible(true);
            dispose();
        });
    }
}
