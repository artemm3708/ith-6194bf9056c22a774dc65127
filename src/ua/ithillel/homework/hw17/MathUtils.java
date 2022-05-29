package ua.ithillel.homework.hw17;

import java.util.Arrays;

public final class MathUtils {

    private MathUtils() {}

    public static int[] arrayFormatting(int[] array) {
        int indexOfFour = 0;
        if (Arrays.stream(array).noneMatch(x -> x == 4)) {
            throw new RuntimeException("No 4 in array");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]==4) {
                indexOfFour = i;
            }
        }
        int[] returnArray = new int[array.length-indexOfFour-1];
        int index = 0;
        for (int i = indexOfFour+1; i < array.length; i++) {
            returnArray[index] = array[i];
            index++;
        }
        return returnArray;
    }

    public static boolean filterFourAndOne(int[] array) {
        if (Arrays.stream(array).allMatch(x -> x == 1) || Arrays.stream(array).allMatch(x -> x == 4)) {
            return false;
        } else {
            return Arrays.stream(array).allMatch(x -> x == 1 || x == 4);
        }
    }
}
