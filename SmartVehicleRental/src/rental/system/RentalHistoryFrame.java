package rental.system;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class RentalHistoryFrame extends JFrame {
    public RentalHistoryFrame() {
        setTitle("Rental History");
        setSize(700, 350);
        setLocationRelativeTo(null);

        DefaultTableModel model = new DefaultTableModel(
                new String[]{"Vehicle", "Vehicle Number", "Days",
                    "Amount", "Status"}, 0);

        JTable table = new JTable(model);

        for (Booking b : AppData.bookings) {
            if (b.getCustomer() == AppData.loggedInCustomer) {
                model.addRow(new Object[]{
                    b.getVehicle().getVehicleName(),
                    b.getVehicle().getVehicleNumber(),
                    b.getDays(),
                    b.getTotalAmount(),
                    b.getStatus()
                });
            }
        }

        add(new JScrollPane(table), BorderLayout.CENTER);

        JButton close = new JButton("Close");
        add(close, BorderLayout.SOUTH);
        close.addActionListener(e -> dispose());
    }
}
