package ua.ithillel.homework.hw8.phonebook;

public class Main {

    public static void main(String[] args) {

        Record artem = new Record(509981704, "Artem");
        Record lera = new Record(509981705, "Lera");
        Record artem2 = new Record(509981708, "Artem");
        TelephoneBook book = new TelephoneBook();

        book.add(artem);
        book.add(lera);
        book.add(artem2);
        System.out.println(book.find("Artem"));
        System.out.println(book.findAll("Artem"));
    }
}
