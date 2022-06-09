package ua.ithillel.homework.hw10.set;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Привет", "Mир", "Привет", "!");

        List<Integer> integers = Arrays.asList(1, 3, 3, 6, 9, 7, 6, 1);

        System.out.println(convertToUnique(strings));
        System.out.println(getSortedUniqueIntegersASC(integers));
        System.out.println(getSortedUniqueIntegersDESC(integers));
        System.out.println(buildSentenceDirection(strings));

    }

    public static Set<String> convertToUnique(List<String> strings) {
        return new HashSet<>(strings);
    }

    public static Set<Integer> getSortedUniqueIntegersASC(List<Integer> integers) {
        List<Integer> sortedList = new ArrayList<>(integers);
        Collections.sort(sortedList);
        return new HashSet<>(sortedList);
    }

    public static List<Integer> getSortedUniqueIntegersDESC(List<Integer> integers) {
        Set<Integer> unique = new HashSet<>(getSortedUniqueIntegersASC(integers));
        List<Integer> reverseList = new ArrayList<>(unique);
        Collections.reverse(reverseList);
        return reverseList;
    }

    public static Set<String> buildSentenceDirection(List<String> strings) {
        return new LinkedHashSet<>(strings);
    }
}
