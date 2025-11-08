package main.model;

public class Booking {
    private Customer customer;
    private Taxi taxi;
    private String pickup, drop;

    public Booking(Customer customer, Taxi taxi, String pickup, String drop) {
        this.customer = customer;
        this.taxi = taxi;
        this.pickup = pickup;
        this.drop = drop;
    }

    public void showBookingDetails() {
        System.out.println("Booking for: " + customer.getName());
        System.out.println("From: " + pickup + " To: " + drop);
        System.out.println("Taxi: " + taxi.toString());
    }
}
