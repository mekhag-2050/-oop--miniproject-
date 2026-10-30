public class Booking {
    private Customer customer;
    private Vehicle vehicle;
    private int days;
    private double totalAmount;
    private String status;

    public Booking(Customer customer, Vehicle vehicle, int days) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
        totalAmount = vehicle.getRentPerDay() * days;
        status = "Pending";
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getDays() {
        return days;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
