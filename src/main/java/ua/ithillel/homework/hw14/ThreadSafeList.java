package ua.ithillel.homework.hw14;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadSafeList<E> {

    private List<E> list = new ArrayList<>();
    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public void add(E e) {
        try {
            lock.writeLock().lock();
            list.add(e);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void remove(int index) {
        try {
            lock.writeLock().lock();
            list.remove(index);
        } finally {
            lock.readLock().unlock();
        }
    }

    public E get(int index) {
        try {
            lock.readLock().lock();
            return list.get(index);
        } finally {
            lock.readLock().unlock();
        }
    }
}
