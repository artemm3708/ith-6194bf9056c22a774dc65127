package ua.ithillel.homework.hw13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

public class FileLogger {

    public void info(String message, FileLoggerConfiguration fileLoggerConfiguration) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileLoggerConfiguration.getFile(), true))) {
            writer.append(new StringBuilder("[" + LocalTime.now() + "] [" + fileLoggerConfiguration.getCurrentLevel() +
                    "] Сообщение: [" + message + "]"));
            writer.newLine();
            if (fileLoggerConfiguration.getMaxSize() < fileLoggerConfiguration.getFile().length()) {
                throw new FileMaxSizeReachedException(fileLoggerConfiguration.getMaxSize(), fileLoggerConfiguration.getFile(), fileLoggerConfiguration.getFile().length());
            }
        } catch (IOException | FileMaxSizeReachedException e) {
            e.printStackTrace();
        }
    }

    public void debug(String message, FileLoggerConfiguration fileLoggerConfiguration) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileLoggerConfiguration.getFile(), true))) {
            writer.append(new StringBuilder("[" + LocalTime.now() + "] [" + fileLoggerConfiguration.getCurrentLevel() +
                    "] Сообщение: [" + message + "]"));
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

enum LoggingLevel {
    INFO,
    DEBUG
}
