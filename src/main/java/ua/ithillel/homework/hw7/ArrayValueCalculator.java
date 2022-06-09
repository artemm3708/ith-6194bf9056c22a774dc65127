package ua.ithillel.homework.hw7;

public class ArrayValueCalculator {

    public int doCalc(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int result = 0;

        if (array.length != 4) {
            throw new MyArraySizeException("out of range");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) throw new MyArraySizeException("out of range");
            for (int j = 0; j < array[i].length; j++) {
                try {
                    result += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException ex) {
                    System.out.println("Invalid data in [" + i + "][" + j + "]");
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return result;
    }
}
