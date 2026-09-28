 public PaymentFrame() {
        setTitle("Payment");
        setSize(500, 430);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel title = new JLabel("PAYMENT");
        title.setBounds(210, 20, 100, 25);
        add(title);

        JLabel l1 = new JLabel("Booking ID:");
        l1.setBounds(40, 70, 130, 25);
        add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(180, 70, 240, 25);
        add(t1);

        JLabel l2 = new JLabel("Total Amount:");
        l2.setBounds(40, 110, 130, 25);
        add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(180, 110, 240, 25);
        add(t2);

        JLabel l3 = new JLabel("Payment Method:");
        l3.setBounds(40, 150, 130, 25);
        add(l3);

        JComboBox<String> c1 = new JComboBox<>(
                new String[]{
                    "Cash",
                    "UPI",
                    "Card"
                });
        c1.setBounds(180, 150, 240, 25);
        add(c1);

        JLabel l4 = new JLabel("Payment Status:");
        l4.setBounds(40, 190, 130, 25);
        add(l4);

        JComboBox<String> c2 = new JComboBox<>(
                new String[]{
                    "Pending",
                    "Paid"
                });
        c2.setBounds(180, 190, 240, 25);
        add(c2);

        JButton b1 = new JButton("Make Payment");
        b1.setBounds(150, 250, 180, 35);
        add(b1);

        JButton b2 = new JButton("View Bill");
        b2.setBounds(150, 300, 180, 35);
        add(b2);

        JButton b3 = new JButton("Back");
        b3.setBounds(150, 350, 180, 30);
        add(b3);
    }

    public static void main(String[] args) {
        new PaymentFrame().setVisible(true);
    }
}
