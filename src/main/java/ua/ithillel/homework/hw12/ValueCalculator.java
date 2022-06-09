package ua.ithillel.homework.hw12;

public class ValueCalculator {

    private double[] array;
    private long size;
    private int half;

    public ValueCalculator(double[] array) {
        this.array = array;
        this.size = array.length;
        this.half = array.length / 2;
    }

    public synchronized void doCalc() throws InterruptedException {
        long start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            array[i] = 1;
        }

        double[] a1 = new double[half];
        double[] a2 = new double[half];
        System.arraycopy(array, 0, a1, 0, half);
        System.arraycopy(array, half, a2, 0, half);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < a1.length; i++) {
                    a1[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < a2.length; i++) {
                    a2[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.arraycopy(a1, 0, array, 0, half);
        System.arraycopy(a2, 0, array, half, half);

        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));
    }
}
