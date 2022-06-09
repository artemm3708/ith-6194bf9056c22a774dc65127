package ua.ithillel.homework.hw6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input string");
        String userString = scanner.nextLine();

        System.out.println(findWordPosition(userString, "pollo"));

    }

    public static int findSymbolOccurance(String str, char ch) {
        int count = 0;
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ch) {
                count++;
            }
        }
        return count;
    }

    public static int findWordPosition(String source, String target) {
            return source.indexOf(target);
    }

    public static String stringReverse(String str) {
        char[] array = str.toCharArray();
        StringBuilder reverse = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            reverse.append(array[i]);
        }
        return reverse.toString();
    }

    public static boolean isPalindrome(String str) {
        String reverse = stringReverse(str);
        return str.equalsIgnoreCase(reverse);
    }



}
