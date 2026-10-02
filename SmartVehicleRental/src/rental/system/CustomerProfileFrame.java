package rental.system;

import javax.swing.*;

public class CustomerProfileFrame extends JFrame {

    public CustomerProfileFrame() {
        setTitle("My Profile - Smart Vehicle Rental");
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel title = new JLabel("MY PROFILE");
        title.setBounds(190, 25, 150, 30);
        add(title);

        JLabel l1 = new JLabel("Customer Name:");
        l1.setBounds(40, 80, 120, 25);
        add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(170, 80, 250, 25);
        add(t1);

        JLabel l2 = new JLabel("Phone No:");
        l2.setBounds(40, 120, 120, 25);
        add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(170, 120, 250, 25);
        add(t2);

        JLabel l3 = new JLabel("Email:");
        l3.setBounds(40, 160, 120, 25);
        add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(170, 160, 250, 25);
        add(t3);

        JLabel l4 = new JLabel("License No:");
        l4.setBounds(40, 200, 120, 25);
        add(l4);

        JTextField t4 = new JTextField();
        t4.setBounds(170, 200, 250, 25);
        add(t4);

        JLabel l5 = new JLabel("Address:");
        l5.setBounds(40, 240, 120, 25);
        add(l5);

        JTextField t5 = new JTextField();
        t5.setBounds(170, 240, 250, 25);
        add(t5);

        JLabel l6 = new JLabel("Username:");
        l6.setBounds(40, 280, 120, 25);
        add(l6);

        JTextField t6 = new JTextField();
        t6.setBounds(170, 280, 250, 25);
        add(t6);

        JButton b1 = new JButton("Update Profile");
        b1.setBounds(150, 340, 150, 35);
        add(b1);

        JButton b2 = new JButton("Back");
        b2.setBounds(150, 390, 150, 30);
        add(b2);
    }

    public static void main(String[] args) {
        new CustomerProfileFrame().setVisible(true);
    }
}
