package ua.ithillel.homework.hw8;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        String[] stringArray = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "nut", "olive",
                "pea", "peanut"};

        Collections.addAll(strings, stringArray);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(2);

        System.out.println(findUnique(list));

    }

    public static int countOccurrence(List<String> strings, String compare) {
        int count = 0;
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).equals(compare)) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> toList(Integer[] array) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, array);
        return integers;
    }

    public static HashSet<Integer> findUnique(List<Integer> list) {
        HashSet<Integer> returnList = new HashSet<>();
        returnList.addAll(list);
        return returnList;
    }

    public static void calcOccurrence(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            int count = 0;
            for (int j = 0; j < strings.size(); j++) {
                if (strings.get(i).equals(strings.get(j))) {
                    count++;
                }
            }
            System.out.println(strings.get(i) + ": " + count);
        }
    }

    public static List<String> findOccurrence(List<String> strings) {
        List<String> returnList = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            int count = 0;
            for (int j = 0; j < strings.size(); j++) {
                if (strings.get(i).equals(strings.get(j))) {
                    count++;
                }
            }
            returnList.add("{name: '" + strings.get(i) + "', occurrence: " + count + "}");
        }
        return returnList;
    }

}
