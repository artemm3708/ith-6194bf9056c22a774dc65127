package ua.ithillel.homework.hw9;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> strings = new LinkedList<>();

        String[] stringArray = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "nut", "olive",
                "pea", "peanut"};

        Collections.addAll(strings, stringArray);

        LinkedList<Integer> integers = new LinkedList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        LinkedList<Integer> integers2 = new LinkedList<Integer>(List.of(10, 1, 12, 13, 4, 15, 16, 7, 18, 19));

        System.out.println(intersect(integers, integers2));
    }

    public static void addFirst(LinkedList<String> strings, String str) {
        strings.addFirst(str);
    }

    public static void addLast(LinkedList<String> strings, String str) {
        strings.addLast(str);
    }

    public static LinkedList<Integer> join(LinkedList<Integer> first, LinkedList<Integer> second) {
        LinkedList<Integer> result = new LinkedList<>();
        result.addAll(0, first);
        result.addAll(first.size(), second);
        return result;
    }

    public static LinkedList<Integer> shuffle(LinkedList<Integer> integers) {
        Collections.shuffle(integers);
        return integers;
    }

    public static LinkedList<Integer> intersect(LinkedList<Integer> first, LinkedList<Integer> second) {
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < first.size(); i++) {
            for (int j = 0; j < second.size(); j++) {
                if (first.get(i).equals(second.get(j))) {
                    result.add(first.get(i));
                }
            }
        }
        return result;
    }
}
