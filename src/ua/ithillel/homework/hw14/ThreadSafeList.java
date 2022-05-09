package ua.ithillel.homework.hw14;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafeList<E> {

    private List<E> list = new ArrayList<>();

    public synchronized void add(E e) {
        list.add(e);
    }

    public synchronized void remove(int index) {
        list.remove(index);
    }

    public synchronized E get(int index) {
        return list.get(index);
    }

}
