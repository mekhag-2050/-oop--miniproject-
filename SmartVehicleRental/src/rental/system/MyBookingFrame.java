package rental.system;

import javax.swing.*;

public class MyBookingFrame extends JFrame {

    public MyBookingFrame() {
        setTitle("My Booking");
        setSize(550, 430);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel title = new JLabel("MY BOOKING");
        title.setBounds(210, 20, 150, 25);
        add(title);

        JLabel l1 = new JLabel("Booking ID:");
        l1.setBounds(30, 70, 120, 25);
        add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(160, 70, 280, 25);
        add(t1);

        JLabel l2 = new JLabel("Vehicle:");
        l2.setBounds(30, 110, 120, 25);
        add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(160, 110, 280, 25);
        add(t2);

        JLabel l3 = new JLabel("Start Date:");
        l3.setBounds(30, 150, 120, 25);
        add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(160, 150, 280, 25);
        add(t3);

        JLabel l4 = new JLabel("No. of Days:");
        l4.setBounds(30, 190, 120, 25);
        add(l4);

        JTextField t4 = new JTextField();
        t4.setBounds(160, 190, 280, 25);
        add(t4);

        JLabel l5 = new JLabel("Booking Status:");
        l5.setBounds(30, 230, 120, 25);
        add(l5);

        JTextField t5 = new JTextField();
        t5.setBounds(160, 230, 280, 25);
        add(t5);

        JButton b1 = new JButton("View Bill");
        b1.setBounds(120, 290, 130, 35);
        add(b1);

        JButton b2 = new JButton("Cancel Booking");
        b2.setBounds(270, 290, 150, 35);
        add(b2);

        JButton b3 = new JButton("Back");
        b3.setBounds(190, 350, 130, 30);
        add(b3);
    }

    public static void main(String[] args) {
        new MyBookingFrame().setVisible(true);
    }
}
