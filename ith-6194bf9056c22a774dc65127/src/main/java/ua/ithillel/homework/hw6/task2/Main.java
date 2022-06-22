package ua.ithillel.homework.hw6.task2;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int arrayAmount = 0;
        for (int i = 0; i < words.length; i++) {
            arrayAmount++;
        }

        String hiddenWord = words[random.nextInt(arrayAmount)];
        System.out.println(hiddenWord);

        System.out.println("input your word");
        String userWord = scanner.nextLine();

        if (isGuessWord(hiddenWord, userWord)) {
            System.out.println("You guess");
            System.out.println(userWord);
        } else {
            System.out.println(sameLetters(hiddenWord, userWord));
        }

        while (!isGuessWord(hiddenWord, userWord)) {
            game(scanner, hiddenWord);
        }

    }

    private static void game(Scanner scanner, String hiddenWord) {
        System.out.println("input your word");
        String userWord = scanner.nextLine();

        if (isGuessWord(hiddenWord, userWord)) {
            System.out.println("You guess");
            System.out.println(userWord);
        } else {
            System.out.println(sameLetters(hiddenWord, userWord));
        }
    }

    public static boolean isGuessWord(String hiddenWord, String userWord) {
        return hiddenWord.equals(userWord);
    }

    public static String sameLetters(String hiddenWord, String userWord) {

        String returnWord = "###############";
        char[] returnChar = returnWord.toCharArray();
        char[] hiddenChar = hiddenWord.toCharArray();
        char[] userChar = userWord.toCharArray();

        for (int i = 0; i < hiddenChar.length; i++) {
            for (int j = 0; j < userChar.length; j++) {
                if (hiddenChar[i] == userChar[j]) {
                    returnChar[i] = hiddenWord.charAt(i);
                }
            }
        }
        return String.valueOf(returnChar);
    }
}
