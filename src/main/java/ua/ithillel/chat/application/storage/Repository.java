package ua.ithillel.chat.application.storage;

import java.util.Collection;

public interface Repository<T> {
    void add(T entity);
    void add(Collection<T> entity);
    Collection<T> findAll();
}
