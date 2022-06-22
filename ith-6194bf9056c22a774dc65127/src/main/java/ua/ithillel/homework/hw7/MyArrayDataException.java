package ua.ithillel.homework.hw7;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int i, int j) {
        super("Invalid data in [" + i + "][" + j + "]");
    }

}
