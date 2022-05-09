package ua.ithillel.homework.hw14;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class PetrolStation {

    private double amount;
    private Semaphore semaphore = new Semaphore(3);


    public PetrolStation(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void doRefuel(double fuel) {
        try {
            semaphore.acquire();
            Thread.sleep(new Random().nextInt(((10 - 3) + 3) * 1000));
            amount -= fuel;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
