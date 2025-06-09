package com.omara.jem.kaori.utils;

public class Logger {
    public static void log(String message) {
        System.out.println("[LOG] " + message);
    }

    public static void warn(String message) {
        System.out.println("[WARN] " + message);
    }

    public static void error(String message) {
        System.err.println("[ERROR] " + message);
    }
}
