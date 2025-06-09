package com.omara.jem.kaori.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SecureHttpClient {
    public static boolean callHomeAuthorization(String authUrl) {
        try {
            Logger.log("[SecureHttpClient] Checking local license file...");
            File file = new File("src/com/omara/jem/kaori/license/license.key");
            if (!file.exists()) {
                Logger.error("[SecureHttpClient] License file missing!");
                return false;
            }
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line = reader.readLine();
                Logger.log("[SecureHttpClient] License file: " + line);
                return "AUTHORIZED".equalsIgnoreCase(line.trim());
            }
        } catch (Exception e) {
            Logger.error("[SecureHttpClient] Authorization failed: " + e.getMessage());
            return false;
        }
    }
}
