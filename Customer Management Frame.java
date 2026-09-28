package rental.system;

import javax.swing.*;

public class CustomerManagementFrame extends JFrame {

    public CustomerManagementFrame() {
        setTitle("Customer Management");
        setSize(550, 470);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel title = new JLabel("CUSTOMER MANAGEMENT");
        title.setBounds(180, 20, 220, 25);
        add(title);

        JLabel l1 = new JLabel("Customer Name:");
        l1.setBounds(30, 70, 120, 25);
        add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(160, 70, 280, 25);
        add(t1);

        JLabel l2 = new JLabel("Phone No:");
        l2.setBounds(30, 110, 120, 25);
        add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(160, 110, 280, 25);
        add(t2);

        JLabel l3 = new JLabel("Email:");
        l3.setBounds(30, 150, 120, 25);
        add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(160, 150, 280, 25);
        add(t3);

        JLabel l4 = new JLabel("License No:");
        l4.setBounds(30, 190, 120, 25);
        add(l4);

        JTextField t4 = new JTextField();
        t4.setBounds(160, 190, 280, 25);
        add(t4);

        JLabel l5 = new JLabel("Address:");
        l5.setBounds(30, 230, 120, 25);
        add(l5);

        JTextField t5 = new JTextField();
        t5.setBounds(160, 230, 280, 25);
        add(t5);

        JButton b1 = new JButton("Update");
        b1.setBounds(100, 300, 120, 35);
        add(b1);

        JButton b2 = new JButton("Delete");
        b2.setBounds(240, 300, 120, 35);
        add(b2);

        JButton b3 = new JButton("View");
        b3.setBounds(380, 300, 100, 35);
        add(b3);
    }

    public static void main(String[] args) {
        new CustomerManagementFrame().setVisible(true);
    }
}
