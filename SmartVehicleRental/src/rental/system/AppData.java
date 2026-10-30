package rental.system;

import java.util.ArrayList;

public class AppData {
    public static ArrayList<Customer> customers = new ArrayList<Customer>();
    public static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    public static ArrayList<Booking> bookings = new ArrayList<Booking>();

    public static Customer loggedInCustomer;

    static {
        vehicles.add(new Vehicle("Maruti Swift", "KL01AB1234",
                "Car", 1500));

        vehicles.add(new Vehicle("Hyundai i20", "KL01CD5678",
                "Car", 1800));

        vehicles.add(new Vehicle("Honda Activa", "KL01EF9012",
                "Bike", 500));

        vehicles.add(new Vehicle("Royal Enfield", "KL01GH3456",
                "Bike", 1000));
    }
}
