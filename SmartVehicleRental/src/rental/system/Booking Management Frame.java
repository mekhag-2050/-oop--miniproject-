package rental.system;

import javax.swing.*;

public class BookingManagementFrame extends JFrame {

    public BookingManagementFrame() {
        setTitle("Booking Management");
        setSize(550, 430);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel title = new JLabel("BOOKING MANAGEMENT");
        title.setBounds(180, 20, 220, 25);
        add(title);

        JLabel l1 = new JLabel("Booking ID:");
        l1.setBounds(30, 70, 120, 25);
        add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(160, 70, 280, 25);
        add(t1);

        JLabel l2 = new JLabel("Customer:");
        l2.setBounds(30, 110, 120, 25);
        add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(160, 110, 280, 25);
        add(t2);

        JLabel l3 = new JLabel("Vehicle:");
        l3.setBounds(30, 150, 120, 25);
        add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(160, 150, 280, 25);
        add(t3);

        JLabel l4 = new JLabel("Start Date:");
        l4.setBounds(30, 190, 120, 25);
        add(l4);

        JTextField t4 = new JTextField();
        t4.setBounds(160, 190, 280, 25);
        add(t4);

        JLabel l5 = new JLabel("Booking Status:");
        l5.setBounds(30, 230, 120, 25);
        add(l5);

        JComboBox<String> c1 = new JComboBox<>(
                new String[]{
                    "Confirmed",
                    "Pending",
                    "Cancelled",
                    "Completed"
                });
        c1.setBounds(160, 230, 280, 25);
        add(c1);

        JButton b1 = new JButton("Update Booking");
        b1.setBounds(100, 290, 150, 35);
        add(b1);

        JButton b2 = new JButton("Delete Booking");
        b2.setBounds(280, 290, 150, 35);
        add(b2);
    }

    public static void main(String[] args) {
        new BookingManagementFrame().setVisible(true);
    }
}
