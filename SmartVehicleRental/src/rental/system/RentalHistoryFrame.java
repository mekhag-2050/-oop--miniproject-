package rental.system;

import javax.swing.*;

public class RentalHistoryFrame extends JFrame {

    public RentalHistoryFrame() {
        setTitle("Rental History");
        setSize(550, 430);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel title = new JLabel("RENTAL HISTORY");
        title.setBounds(200, 20, 170, 25);
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

        JLabel l3 = new JLabel("Rental Date:");
        l3.setBounds(30, 150, 120, 25);
        add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(160, 150, 280, 25);
        add(t3);

        JLabel l4 = new JLabel("Return Date:");
        l4.setBounds(30, 190, 120, 25);
        add(l4);

        JTextField t4 = new JTextField();
        t4.setBounds(160, 190, 280, 25);
        add(t4);

        JLabel l5 = new JLabel("Total Amount:");
        l5.setBounds(30, 230, 120, 25);
        add(l5);

        JTextField t5 = new JTextField();
        t5.setBounds(160, 230, 280, 25);
        add(t5);

        JButton b1 = new JButton("View Bill");
        b1.setBounds(150, 290, 150, 35);
        add(b1);

        JButton b2 = new JButton("Back");
        b2.setBounds(150, 350, 150, 30);
        add(b2);
    }

    public static void main(String[] args) {
        new RentalHistoryFrame().setVisible(true);
    }
}
