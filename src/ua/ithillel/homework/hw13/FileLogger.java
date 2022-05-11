package ua.ithillel.homework.hw13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger {

    private final FileLoggerConfiguration configuration;

    public FileLogger(FileLoggerConfiguration configuration) {
        this.configuration = configuration;
    }

    public void info(String message) {
        this.configuration.setCurrentLevel(LoggingLevel.INFO);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.configuration.getFile(), true))) {
            if (this.configuration.getMaxSize() < this.configuration.getFile().length()) {
                throw new FileMaxSizeReachedException(String.format("In %s size (%s) is bigger than max size (%s)",
                        this.configuration.getFile().getPath(), this.configuration.getFile().length(), this.configuration.getMaxSize()));
            } else {
                writer.append(this.configuration.setFormat(message));
                writer.newLine();
            }
        } catch (FileMaxSizeReachedException e) {
            System.out.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void debug(String message) {
        this.configuration.setCurrentLevel(LoggingLevel.DEBUG);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.configuration.getFile(), true))) {
            if (this.configuration.getMaxSize() < this.configuration.getFile().length()) {
                throw new FileMaxSizeReachedException(String.format("In %s size (%s) is bigger than max size (%s)",
                        this.configuration.getFile().getPath(), this.configuration.getFile().length(), this.configuration.getMaxSize()));
            } else {
                writer.append(this.configuration.setFormat(message));
                writer.newLine();
            }
        } catch (FileMaxSizeReachedException e) {
            System.out.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
