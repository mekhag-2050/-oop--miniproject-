package rental.system;

import javax.swing.*;
import java.awt.*;

public class CustomerManagementFrame extends JFrame {

    public CustomerManagementFrame() {

        setTitle("Customer Management");
        setSize(550, 470);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Title
        JLabel title = new JLabel(
                "CUSTOMER MANAGEMENT",
                SwingConstants.CENTER);

        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title, BorderLayout.NORTH);

        // Form Panel
        JPanel formPanel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 10, 8, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Customer Name
        JLabel l1 = new JLabel("Customer Name:");
        JTextField t1 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0;
        formPanel.add(l1, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t1, gbc);

        // Phone No
        JLabel l2 = new JLabel("Phone No:");
        JTextField t2 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0;
        formPanel.add(l2, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t2, gbc);

        // Email
        JLabel l3 = new JLabel("Email:");
        JTextField t3 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0;
        formPanel.add(l3, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t3, gbc);

        // License No
        JLabel l4 = new JLabel("License No:");
        JTextField t4 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weightx = 0;
        formPanel.add(l4, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t4, gbc);

        // Address
        JLabel l5 = new JLabel("Address:");
        JTextField t5 = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weightx = 0;
        formPanel.add(l5, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        formPanel.add(t5, gbc);

        add(formPanel, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel(
                new FlowLayout(FlowLayout.CENTER, 15, 10));

        JButton b1 = new JButton("Update");
        JButton b2 = new JButton("Delete");
        JButton b3 = new JButton("View");

        buttonPanel.add(b1);
        buttonPanel.add(b2);
        buttonPanel.add(b3);

        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CustomerManagementFrame();
    }
}
