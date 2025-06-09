package com.omara.jem.kaori.utils;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class UserAuthManager {
    private static final String USER_DATA_FILE = "users_data.ser";
    private static Map<String, String> users = new HashMap<>();

    static {
        loadUsers();
    }

    public static boolean authenticate(String username, String password) {
        String storedHash = users.get(username);
        if (storedHash != null && storedHash.equals(hashPassword(password))) {
            Logger.log("[UserAuthManager] Authentication successful for user: " + username);
            return true;
        }
        Logger.log("[UserAuthManager] Authentication failed for user: " + username);
        return false;
    }

    public static void registerUser(String username, String password) {
        users.put(username, hashPassword(password));
        saveUsers();
        Logger.log("[UserAuthManager] New user registered: " + username);
    }

    private static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(password.getBytes());
            return Base64.getEncoder().encodeToString(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            Logger.error("[UserAuthManager] Password hashing failed: " + e.getMessage());
            return null;
        }
    }

    private static void saveUsers() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(USER_DATA_FILE))) {
            oos.writeObject(users);
        } catch (IOException e) {
            Logger.error("[UserAuthManager] Failed to save users data: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private static void loadUsers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(USER_DATA_FILE))) {
            users = (Map<String, String>) ois.readObject();
            Logger.log("[UserAuthManager] User data loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            Logger.log("[UserAuthManager] No existing user data found or failed to load.");
        }
    }
}
