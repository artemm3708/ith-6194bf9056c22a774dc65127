package ua.ithillel.homework.hw4.task2;

import java.util.Arrays;

public class Iterator {

    int[][] arr;
    int currentPosition = 0;
    int a = 0;

    public Iterator(int[][] arr) {
        this.arr = arr;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                Arrays.sort(arr[i]);
            }
        }
    }

    public boolean hasNext() {
        boolean next = false;
        for (int i = currentPosition; i < this.arr.length; i++) {
            for (int j = currentPosition; j < this.arr[i].length; j++) {
                if (currentPosition < this.arr[i][j]) {
                    next = true;
                }
            }
        }
        return next;
    }

    public int next() {
        for (int i = currentPosition; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                a = this.arr[i][j];
                currentPosition++;
                return a;
            }
        }
        return a;
    }
}
