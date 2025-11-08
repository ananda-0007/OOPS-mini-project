package main.service;

import java.io.FileWriter;
import java.io.IOException;

public class PaymentService {
    public void logPayment(String details) {
        try (FileWriter fw = new FileWriter("payment_log.txt", true)) {
            fw.write(details + "\n");
        } catch (IOException e) {
            System.out.println("Error logging payment: " + e.getMessage());
        }
    }
}
