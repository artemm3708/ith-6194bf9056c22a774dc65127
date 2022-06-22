package ua.ithillel.homework.hw12;

public class Main {

    public static void main(String[] args) {

        ValueCalculator calculator = new ValueCalculator(new double[5_000_000]);

        try {
            calculator.doCalc();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
