package ua.ithillel.homework.hw13;

import java.io.File;
import java.time.LocalTime;

public class FileLoggerConfiguration {

    private long maxSize;
    private String format;
    private File file;
    private LoggingLevel currentLevel;

    public FileLoggerConfiguration(File file, int maxSize) {
        this.file = file;
        this.maxSize = maxSize;
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

    public void setCurrentLevel(LoggingLevel currentLevel) {
        this.currentLevel = currentLevel;
    }

    public String setFormat(String message) {
        return this.format = String.format("[%s] [%s] Message: %s", LocalTime.now(), this.currentLevel, message);
    }
}
