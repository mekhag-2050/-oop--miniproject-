package rental.system;

import javax.swing.*;

public class CustomerRegistrationFrame extends JFrame {

    public CustomerRegistrationFrame() {
        setTitle("Customer Registration");
        setSize(500, 470);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel title = new JLabel("CUSTOMER REGISTRATION");
        title.setBounds(160, 20, 220, 25);
        add(title);

        JLabel l1 = new JLabel("Customer Name:");
        l1.setBounds(30, 70, 120, 25);
        add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(160, 70, 250, 25);
        add(t1);

        JLabel l2 = new JLabel("Phone No:");
        l2.setBounds(30, 110, 120, 25);
        add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(160, 110, 250, 25);
        add(t2);

        JLabel l3 = new JLabel("Email:");
        l3.setBounds(30, 150, 120, 25);
        add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(160, 150, 250, 25);
        add(t3);

        JLabel l4 = new JLabel("License No:");
        l4.setBounds(30, 190, 120, 25);
        add(l4);

        JTextField t4 = new JTextField();
        t4.setBounds(160, 190, 250, 25);
        add(t4);

        JLabel l5 = new JLabel("Address:");
        l5.setBounds(30, 230, 120, 25);
        add(l5);

        JTextField t5 = new JTextField();
        t5.setBounds(160, 230, 250, 25);
        add(t5);

        JLabel l6 = new JLabel("Username:");
        l6.setBounds(30, 270, 120, 25);
        add(l6);

        JTextField t6 = new JTextField();
        t6.setBounds(160, 270, 250, 25);
        add(t6);

        JLabel l7 = new JLabel("Password:");
        l7.setBounds(30, 310, 120, 25);
        add(l7);

        JPasswordField t7 = new JPasswordField();
        t7.setBounds(160, 310, 250, 25);
        add(t7);

        JButton b1 = new JButton("Register");
        b1.setBounds(160, 360, 120, 35);
        add(b1);

        JButton b2 = new JButton("Back");
        b2.setBounds(300, 360, 100, 35);
        add(b2);
    }

    public static void main(String[] args) {
        new CustomerRegistrationFrame().setVisible(true);
    }
}
