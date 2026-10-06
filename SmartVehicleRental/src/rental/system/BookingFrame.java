package rental.system;

import javax.swing.*;

public class BookingFrame extends JFrame {

    public BookingFrame() {

        setTitle("Book Vehicle");
        setSize(550, 500);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Title
        JLabel title = new JLabel("BOOK VEHICLE");
        title.setBounds(210, 20, 150, 25);
        add(title);

        // Vehicle Model
        JLabel l1 = new JLabel("Vehicle Model:");
        l1.setBounds(40, 70, 130, 25);
        add(l1);

        JLabel model = new JLabel("Honda City");
        model.setBounds(190, 70, 250, 25);
        add(model);

        // Registration Number
        JLabel l2 = new JLabel("Registration No:");
        l2.setBounds(40, 110, 130, 25);
        add(l2);

        JLabel registration = new JLabel("KL 01 AB 1234");
        registration.setBounds(190, 110, 250, 25);
        add(registration);

        // Start Date
        JLabel l3 = new JLabel("Start Date:");
        l3.setBounds(40, 150, 130, 25);
        add(l3);

        JTextField t1 = new JTextField();
        t1.setBounds(190, 150, 250, 25);
        add(t1);

        // Number of Days
        JLabel l4 = new JLabel("No. of Days:");
        l4.setBounds(40, 190, 130, 25);
        add(l4);

        JTextField t2 = new JTextField();
        t2.setBounds(190, 190, 250, 25);
        add(t2);

        // Daily Rate
        JLabel l5 = new JLabel("Daily Rate:");
        l5.setBounds(40, 230, 130, 25);
        add(l5);

        JLabel rate = new JLabel("₹2,000");
        rate.setBounds(190, 230, 250, 25);
        add(rate);

        // Total Amount
        JLabel l6 = new JLabel("Total Amount:");
        l6.setBounds(40, 270, 130, 25);
        add(l6);

        JLabel total = new JLabel("₹0");
        total.setBounds(190, 270, 250, 25);
        add(total);

        // Calculate & Book
        JButton b1 = new JButton("Calculate & Book");
        b1.setBounds(160, 320, 180, 35);
        add(b1);

        // Proceed to Payment
        JButton b2 = new JButton("Proceed to Payment");
        b2.setBounds(160, 370, 180, 35);
        add(b2);

        // Back
        JButton b3 = new JButton("Back");
        b3.setBounds(160, 420, 180, 30);
        add(b3);
    }

    public static void main(String[] args) {
        new BookingFrame().setVisible(true);
    }
}
