package main.service;

import main.model.*;

public class BookingService {
    public Booking createBooking(Customer c, Taxi t, String from, String to) throws InvalidBookingException {
        if (t == null || !t.isAvailable()) {
            throw new InvalidBookingException("No available taxi found!");
        }
        t.assignRide();
        return new Booking(c, t, from, to);
    }
}
