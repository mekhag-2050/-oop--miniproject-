package rental.system;

import javax.swing.*;
import java.awt.*;

public class CustomerProfileFrame extends JFrame {
    public CustomerProfileFrame() {
        setTitle("My Profile");
        setSize(350, 250);
        setLocationRelativeTo(null);

        Customer c = AppData.loggedInCustomer;

        setLayout(new GridLayout(4, 1, 10, 10));
        add(new JLabel("Name: " + c.getName()));
        add(new JLabel("Email: " + c.getEmail()));
        add(new JLabel("Phone: " + c.getPhone()));

        JButton close = new JButton("Close");
        add(close);
        close.addActionListener(e -> dispose());
    }
        }
