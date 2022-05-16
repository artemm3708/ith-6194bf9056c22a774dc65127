package ua.ithillel.homework.hw14;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class PetrolStation {

    private double amount;
    private CountDownLatch cdl = new CountDownLatch(3);
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public PetrolStation(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public void doRefuel(double fuel) {
        try {
            lock.readLock().lock();
            Thread.sleep(new Random().nextInt(((10 - 3) + 3) * 1000));
            amount -= fuel;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }
}
