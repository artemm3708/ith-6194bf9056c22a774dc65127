package ua.ithillel.homework.hw1;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[10];
        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(sortArray(nums)));
    }

    private static int[] sortArray(int[] nums) {
        int index = 0;
        int[] sortedArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sortedArray[index] = nums[i];
                index += 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                sortedArray[index] = nums[i];
                index += 1;
            }
        }
        return sortedArray;
    }

}
