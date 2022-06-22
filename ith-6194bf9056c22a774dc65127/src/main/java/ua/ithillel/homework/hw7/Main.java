package ua.ithillel.homework.hw7;

public class Main {

    public static void main(String[] args) {

        String[][] array = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "f"}
        };

        ArrayValueCalculator calculator = new ArrayValueCalculator();

        try {
            System.out.println(calculator.doCalc(array));
        } catch (MyArraySizeException ex) {
            System.out.println("array is out of range");
        } catch (MyArrayDataException ex) {
            System.out.println("out of data");
        }

    }

}
