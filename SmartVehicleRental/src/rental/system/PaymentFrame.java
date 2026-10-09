package rental.system;

import javax.swing.*;
import java.awt.*;

public class PaymentFrame extends JFrame {

    public PaymentFrame() {

        setTitle("Payment");
        setSize(500, 430);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main Layout
        setLayout(new BorderLayout(10, 10));

        // ==============================
        // TITLE - NORTH
        // ==============================

        JLabel title = new JLabel(
                "PAYMENT",
                SwingConstants.CENTER);

        title.setFont(new Font("Arial", Font.BOLD, 18));

        add(title, BorderLayout.NORTH);

        // ==============================
        // FORM - CENTER
        // ==============================

        JPanel formPanel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(8, 10, 8, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Booking ID
        JLabel l1 = new JLabel("Booking ID:");
        JTextField bookingId = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        formPanel.add(l1, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(bookingId, gbc);

        // Total Amount
        JLabel l2 = new JLabel("Total Amount:");
        JTextField totalAmount = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0;
        formPanel.add(l2, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(totalAmount, gbc);

        // Payment Method
        JLabel l3 = new JLabel("Payment Method:");

        JComboBox<String> paymentMethod =
                new JComboBox<>(
                        new String[]{
                                "Cash",
                                "UPI",
                                "Card"
                        });

        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(l3, gbc);

        gbc.gridx = 1;
        formPanel.add(paymentMethod, gbc);

        // Payment Status
        JLabel l4 = new JLabel("Payment Status:");

        JComboBox<String> paymentStatus =
                new JComboBox<>(
                        new String[]{
                                "Pending",
                                "Paid"
                        });

        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(l4, gbc);

        gbc.gridx = 1;
        formPanel.add(paymentStatus, gbc);

        add(formPanel, BorderLayout.CENTER);

        // ==============================
        // BUTTONS - SOUTH
        // ==============================

        JPanel buttonPanel = new JPanel(
                new FlowLayout(
                        FlowLayout.CENTER, 10, 10));

        JButton paymentButton =
                new JButton("Make Payment");

        JButton billButton =
                new JButton("View Bill");

        JButton backButton =
                new JButton("Back");

        buttonPanel.add(paymentButton);
        buttonPanel.add(billButton);
        buttonPanel.add(backButton);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new PaymentFrame();
    }
}
