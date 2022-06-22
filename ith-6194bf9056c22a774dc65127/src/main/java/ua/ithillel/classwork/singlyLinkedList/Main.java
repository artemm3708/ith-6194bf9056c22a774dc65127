package ua.ithillel.classwork.singlyLinkedList;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        SinglyLinkedList<Integer> digits = new SinglyLinkedList<>();

        digits.add(1);
        digits.add(5);
        System.out.println("First: " + digits.get(0));
        System.out.println("Second: " + digits.get(1));

        digits.add(8);
        System.out.println("Third: " + digits.get(2));

        System.out.println("Size: " + digits.size());

//        digits.remove(digits.size() - 1);
        digits.remove(digits.size() / 2);
//        digits.remove(0);
        System.out.println("Size: " + digits.size());

        System.out.println("First: " + digits.get(0));
        System.out.println("Second: " + digits.get(1));

        Iterator<Integer> iterator = digits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
