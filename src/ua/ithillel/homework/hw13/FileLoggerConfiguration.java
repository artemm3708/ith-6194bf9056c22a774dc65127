package ua.ithillel.homework.hw13;

import java.io.File;

public class FileLoggerConfiguration {

    private long maxSize;
    private String format;
    private File file;
    private LoggingLevel currentLevel;

    public FileLoggerConfiguration(File file, LoggingLevel currentLevel, int maxSize, String format) {
        this.file = file;
        this.currentLevel = currentLevel;
        this.maxSize = maxSize;
        this.format = format;
    }

    public long getMaxSize() {
        return maxSize;
    }

    public String getFormat() {
        return format;
    }

    public File getFile() {
        return file;
    }

    public LoggingLevel getCurrentLevel() {
        return currentLevel;
    }
}
