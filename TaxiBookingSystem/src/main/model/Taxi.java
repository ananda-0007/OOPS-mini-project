package main.model;

public class Taxi {
    private int taxiId;
    private String driverName;
    private boolean available = true;

    public Taxi(int taxiId, String driverName) {
        this.taxiId = taxiId;
        this.driverName = driverName;
    }

    public void assignRide() {
        this.available = false;
        System.out.println("Taxi " + taxiId + " assigned to ride.");
    }

    public void completeRide() {
        this.available = true;
        System.out.println("Taxi " + taxiId + " is now available.");
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "Taxi ID: " + taxiId + ", Driver: " + driverName + ", Available: " + available;
    }
}
