package main.service;

public class TaxiThread extends Thread {
    private String taxiName;

    public TaxiThread(String taxiName) {
        this.taxiName = taxiName;
    }

    @Override
    public void run() {
        try {
            System.out.println(taxiName + " is running on thread: " + Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println(taxiName + " completed ride.");
        } catch (InterruptedException e) {
            System.out.println(taxiName + " was interrupted!");
        }
    }
}
