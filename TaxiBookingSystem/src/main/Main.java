package main;

import main.model.*;
import main.service.*;

public class Main {
    public static void main(String[] args) {
        try {
            Taxi t1 = new Taxi(101, "Ravi");
            Customer c1 = new Customer("Akash", "9876543210");

            BookingService bs = new BookingService();
            Booking b = bs.createBooking(c1, t1, "Marthandam", "Nagercoil");

            b.showBookingDetails();

            TaxiThread taxiThread = new TaxiThread("Taxi-101");
            taxiThread.start();

            PaymentService ps = new PaymentService();
            ps.logPayment("Payment completed for Akash");
        } catch (InvalidBookingException e) {
            System.out.println(e.getMessage());
        }
    }
}
