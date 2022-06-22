package ua.ithillel.homework.hw13;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        FileLoggerConfiguration configuration = new FileLoggerConfiguration(new File("text.txt"), 200000);
        FileLogger fileLogger = new FileLogger(configuration);
        fileLogger.info(args[0]);
    }
}
