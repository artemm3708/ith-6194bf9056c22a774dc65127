package ua.ithillel.homework.hw13;

import java.io.File;

public class FileMaxSizeReachedException extends Exception{

    public FileMaxSizeReachedException(long size, File file, long maxSize) {
        super("In " + file.getPath() + "size(" + size + ") bigger than max size(" + maxSize + ")");
    }
}
