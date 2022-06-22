package ua.ithillel.homework.hw8.phonebook;

import java.util.ArrayList;
import java.util.List;

public class TelephoneBook {

    List<Record> members = new ArrayList<>();

    public void add(Record member) {
        members.add(member);
    }

    public Record find(String name) {
        for (Record member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> sameNames = new ArrayList<>();
        for (Record member : members) {
            if (member.getName().equals(name)) {
                sameNames.add(member);
            }
        }
        return sameNames;
    }
}
