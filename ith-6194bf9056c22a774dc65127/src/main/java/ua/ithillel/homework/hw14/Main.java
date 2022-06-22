package ua.ithillel.homework.hw14;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CountDownLatch cdl = new CountDownLatch(3);
        PetrolStation petrolStation = new PetrolStation(1000);

        long start = System.currentTimeMillis();

        while (petrolStation.getAmount() > 0) {
            executorService.submit(lockRunnable(petrolStation, cdl));
            executorService.submit(lockRunnable(petrolStation, cdl));
            executorService.submit(lockRunnable(petrolStation, cdl));
            executorService.submit(lockRunnable(petrolStation, cdl));
            executorService.submit(lockRunnable(petrolStation, cdl));
        }
        executorService.shutdown();
        System.out.println("Operation took: " + (System.currentTimeMillis() - start));

    }

    static Runnable lockRunnable(PetrolStation petrolStation, CountDownLatch cdl) {
        return new Runnable() {
            @Override
            public void run() {
                petrolStation.doRefuel(50);
                cdl.countDown();
            }
        };
    }
}
