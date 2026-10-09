package rental.system;

import javax.swing.*;
import java.awt.*;

public class BillingFrame extends JFrame {

    public BillingFrame() {

        setTitle("Rental Bill");
        setSize(500, 450);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main Layout
        setLayout(new BorderLayout(10, 10));

        // ==============================
        // TITLE - NORTH
        // ==============================

        JLabel title = new JLabel(
                "RENTAL BILL",
                SwingConstants.CENTER);

        title.setFont(new Font("Arial", Font.BOLD, 18));

        add(title, BorderLayout.NORTH);

        // ==============================
        // BILL DETAILS - CENTER
        // ==============================

        JTextArea billArea = new JTextArea();

        billArea.setEditable(false);

        billArea.setText(
                "Customer Name:\n\n" +
                "Vehicle:\n\n" +
                "Registration No:\n\n" +
                "Start Date:\n\n" +
                "No. of Days:\n\n" +
                "Rate per Day:\n\n" +
                "Payment Method:\n\n" +
                "Payment Status:\n\n" +
                "--------------------------\n" +
                "Total Amount:\n"
        );

        JScrollPane scrollPane =
                new JScrollPane(billArea);

        add(scrollPane, BorderLayout.CENTER);

        // ==============================
        // BUTTONS - SOUTH
        // ==============================

        JPanel buttonPanel = new JPanel(
                new FlowLayout(
                        FlowLayout.CENTER, 15, 10));

        JButton printButton =
                new JButton("Print Bill");

        JButton homeButton =
                new JButton("Back to Home");

        buttonPanel.add(printButton);
        buttonPanel.add(homeButton);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new BillingFrame();
    }
}
