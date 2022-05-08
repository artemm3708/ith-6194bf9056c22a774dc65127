package ua.ithillel.homework.hw13;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File text = new File("text.txt");
        FileLoggerConfiguration configurationInfo = new FileLoggerConfiguration(text, LoggingLevel.INFO, 200000, "txt");
        FileLogger fileLogger = new FileLogger();
        fileLogger.info("test", configurationInfo);

        FileLoggerConfiguration configurationDebug = new FileLoggerConfiguration(text, LoggingLevel.DEBUG, 2000, "txt");
        fileLogger.debug("test2", configurationDebug);
    }
}
