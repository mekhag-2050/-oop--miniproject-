package rental.system;

import javax.swing.*;

public class LoginFrame extends JFrame {

    public LoginFrame() {
        setTitle("Login - Smart Vehicle Rental");
        setSize(400, 330);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel title = new JLabel("SMART VEHICLE RENTAL");
        title.setBounds(100, 25, 220, 25);
        add(title);

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(50, 75, 100, 25);
        add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 75, 180, 25);
        add(t1);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(50, 115, 100, 25);
        add(l2);

        JPasswordField t2 = new JPasswordField();
        t2.setBounds(150, 115, 180, 25);
        add(t2);

        JButton b1 = new JButton("Login");
        b1.setBounds(150, 155, 100, 30);
        add(b1);

        JLabel l3 = new JLabel("New customer?");
        l3.setBounds(80, 205, 100, 25);
        add(l3);

        JButton b2 = new JButton("Register");
        b2.setBounds(190, 205, 100, 30);
        add(b2);

        JLabel l4 = new JLabel("Admin Login");
        l4.setBounds(155, 255, 100, 25);
        add(l4);
    }

    public static void main(String[] args) {
        new LoginFrame().setVisible(true);
    }
}
