package com.omara.jem.kaori.utils;

import java.io.File;
import java.security.MessageDigest;
import java.nio.file.Files;

public class IntegrityChecker {
    private static final String EXPECTED_HASH = "your-expected-hash-here"; // Replace with real hash

    public static boolean verifyFile(String path) {
        try {
            File file = new File(path);
            byte[] fileBytes = Files.readAllBytes(file.toPath());
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(fileBytes);

            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            String actualHash = sb.toString();
            return actualHash.equalsIgnoreCase(EXPECTED_HASH);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
