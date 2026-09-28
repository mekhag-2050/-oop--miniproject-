package rental.system;

import javax.swing.*;

public class BillingFrame extends JFrame {

    public BillingFrame() {
        setTitle("Rental Bill");
        setSize(500, 450);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel title = new JLabel(
                "RENTAL BILL",
                SwingConstants.CENTER);
        title.setBounds(150, 20, 200, 30);
        add(title);

        JTextArea billArea = new JTextArea();
        billArea.setBounds(50, 60, 400, 250);
        billArea.setEditable(false);

        billArea.setText(
                "Customer Name: \n" +
                "Vehicle: \n" +
                "Registration No: \n" +
                "Start Date: \n" +
                "No. of Days: \n" +
                "Rate per Day: \n" +
                "Payment Method: \n" +
                "Payment Status: \n" +
                "--------------------------\n" +
                "Total Amount: "
        );

        add(billArea);

        JButton b1 = new JButton("Print Bill");
        b1.setBounds(100, 330, 130, 35);
        add(b1);

        JButton b2 = new JButton("Back to Home");
        b2.setBounds(270, 330, 130, 35);
        add(b2);
    }

    public static void main(String[] args) {
        new BillingFrame().setVisible(true);
    }
}
