package main.ui;

import javax.swing.*;
import java.awt.*;

public class TaxiBookingUI extends JFrame {
    public TaxiBookingUI() {
        setTitle("Taxi Booking System");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Customer Name:"));
        add(new JTextField());
        add(new JLabel("Pickup:"));
        add(new JTextField());
        add(new JLabel("Drop:"));
        add(new JTextField());
        add(new JButton("Book Taxi"));

        setVisible(true);
    }

    public static void main(String[] args) {
        new TaxiBookingUI();
    }
}
