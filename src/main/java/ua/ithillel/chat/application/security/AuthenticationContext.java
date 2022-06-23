package ua.ithillel.chat.application.security;

import java.util.Optional;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class AuthenticationContext {

    public static Set<LoggedUser> loggedUsers;
    private static ReadWriteLock lock = new ReentrantReadWriteLock();

    public static void add(LoggedUser user) {
        try {
            lock.writeLock().lock();
            loggedUsers.add(user);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public static void remove(LoggedUser user) {
        try {
            lock.writeLock().lock();
            loggedUsers.remove(user);
        } finally {
            lock.readLock().unlock();
        }
    }

    public static Optional<LoggedUser> getUser() {
        try {
            lock.writeLock().lock();
            return loggedUsers.stream()
                    .findFirst();
        } finally {
            lock.readLock().unlock();
        }
    }
}
