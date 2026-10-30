package rental.system;

public class Vehicle {
    private String vehicleName;
    private String vehicleNumber;
    private String type;
    private double rentPerDay;
    private boolean available;

    public Vehicle(String name, String number, String type, double rent) {
        vehicleName = name;
        vehicleNumber = number;
        this.type = type;
        rentPerDay = rent;
        available = true;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
  }
