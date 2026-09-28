package rental.system;

import javax.swing.*;

public class AdminLoginFrame extends JFrame {

    public AdminLoginFrame() {
        setTitle("Admin Login");
        setSize(400, 330);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel title = new JLabel("ADMIN LOGIN");
        title.setBounds(150, 30, 150, 25);
        add(title);

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(50, 90, 100, 25);
        add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 90, 180, 25);
        add(t1);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(50, 130, 100, 25);
        add(l2);

        JPasswordField t2 = new JPasswordField();
        t2.setBounds(150, 130, 180, 25);
        add(t2);

        JButton b1 = new JButton("Login");
        b1.setBounds(150, 180, 100, 30);
        add(b1);

        JButton b2 = new JButton("Back");
        b2.setBounds(150, 230, 100, 30);
        add(b2);
    }

    public static void main(String[] args) {
        new AdminLoginFrame().setVisible(true);
    }
}
