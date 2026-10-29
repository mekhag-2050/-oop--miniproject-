package rental.system;

import javax.swing.*;
import java.awt.*;

public class PaymentFrame extends JFrame {
    public PaymentFrame(Booking booking) {
        setTitle("Smart Vehicle Rental System - Payment");
        setSize(750, 500);
        setMinimumSize(new Dimension(550, 400));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Main background
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(new Color(235, 242, 250));

        // Payment card
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

        JLabel title = new JLabel("PAYMENT", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(new Color(25, 65, 115));

        JLabel amount = new JLabel(
                "Amount to Pay: Rs. " + booking.getTotalAmount(),
                JLabel.CENTER);
        amount.setFont(new Font("Arial", Font.BOLD, 19));
        amount.setForeground(new Color(35, 100, 180));

        String[] methods = {"UPI", "Card", "Cash"};
        JComboBox<String> paymentMethod =
                new JComboBox<>(methods);
        paymentMethod.setFont(new Font("Arial", Font.PLAIN, 15));
        paymentMethod.setPreferredSize(new Dimension(300, 42));
        paymentMethod.setBorder(
                BorderFactory.createTitledBorder("Payment Method"));

        JLabel instruction = new JLabel(
                "Select a payment method and confirm.",
                JLabel.CENTER);
        instruction.setFont(new Font("Arial", Font.PLAIN, 14));
        instruction.setForeground(Color.GRAY);

        JButton confirm = new JButton("Confirm Payment");
        confirm.setFont(new Font("Arial", Font.BOLD, 15));
        confirm.setBackground(new Color(35, 100, 180));
        confirm.setForeground(Color.WHITE);
        confirm.setFocusPainted(false);
        confirm.setPreferredSize(new Dimension(250, 42));

        gbc.gridy = 0;
        panel.add(title, gbc);

        gbc.gridy = 1;
        panel.add(amount, gbc);

        gbc.gridy = 2;
        panel.add(paymentMethod, gbc);

        gbc.gridy = 3;
        panel.add(instruction, gbc);

        gbc.gridy = 4;
        panel.add(confirm, gbc);

        mainPanel.add(panel);
        add(mainPanel, BorderLayout.CENTER);

        confirm.addActionListener(e -> {
            booking.setStatus("Paid");

            JOptionPane.showMessageDialog(this,
                    "Payment recorded successfully.");

            new BillingFrame(booking).setVisible(true);
            dispose();
        });
    }
        }
