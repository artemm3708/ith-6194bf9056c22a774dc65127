package ua.ithillel.classwork.singlyLinkedList;

public interface CustomList<E> {

    int size();

    void add(E element);

    E get(int index);

    boolean remove(int index);
}
