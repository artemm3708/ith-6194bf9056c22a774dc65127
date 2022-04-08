package ua.ithillel.homework.hw8.phonebook;

public class Record {

    long phoneNumber;
    String name;

    public Record(long phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", phone: " + phoneNumber;
    }
}
