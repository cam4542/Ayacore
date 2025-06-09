package com.omara.jem.kaori.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ErrorLogger {
    private static final String LOG_FILE = "error_log.txt";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void logError(String errorMessage) {
        String timestamp = LocalDateTime.now().format(formatter);
        String logMessage = "[" + timestamp + "] ERROR: " + errorMessage;
        System.err.println(logMessage);
        writeToFile(logMessage);
    }

    private static void writeToFile(String message) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write(message + System.lineSeparator());
        } catch (IOException e) {
            System.err.println("[ErrorLogger] Failed to write to error log file: " + e.getMessage());
        }
    }
}
