package ua.ithillel.homework.hw11;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] array = {"aaa", "ddddd"};

        System.out.println(toList(array));
    }

    public static <T> List<T> toList(T[] array) {
        return new ArrayList<>(List.of(array));
    }

}
