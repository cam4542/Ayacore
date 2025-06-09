package com.omara.jem.kaori.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void log(String message) {
        String timestamp = sdf.format(new Date());
        System.out.println("[" + timestamp + "] " + message);
    }

    public static void warn(String message) {
        log("[WARNING] " + message);
    }

    public static void error(String message) {
        log("[ERROR] " + message);
    }
}
