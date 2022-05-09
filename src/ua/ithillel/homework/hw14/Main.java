package ua.ithillel.homework.hw14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        PetrolStation petrolStation = new PetrolStation(500);

        for (int i = 0; i < 10; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    petrolStation.doRefuel(50);
                }
            });
        }
        executorService.shutdown();
    }
}
