package com.omara.jem.kaori.utils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DataPersistenceManager {
    private static final String ENV_DATA_FILE = "environment_data.ser";
    private static final String GUI_DATA_FILE = "gui_data.ser";

    // Save environment data
    public static void saveData(Map<String, String> data) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ENV_DATA_FILE))) {
            oos.writeObject(data);
            Logger.log("[DataPersistenceManager] Data saved successfully.");
        } catch (IOException e) {
            ErrorLogger.logError("[DataPersistenceManager] Failed to save data: " + e.getMessage());
        }
    }

    // Load environment data
    @SuppressWarnings("unchecked")
    public static Map<String, String> loadData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ENV_DATA_FILE))) {
            Map<String, String> data = (Map<String, String>) ois.readObject();
            Logger.log("[DataPersistenceManager] Data loaded successfully.");
            return data;
        } catch (IOException | ClassNotFoundException e) {
            ErrorLogger.logError("[DataPersistenceManager] Failed to load data: " + e.getMessage());
            return new HashMap<>();
        }
    }

    // Existing methods for GUI data (optional)
    public static void saveGUIData(Map<String, String> guiData) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(GUI_DATA_FILE))) {
            oos.writeObject(guiData);
            Logger.log("[DataPersistenceManager] GUI data saved successfully.");
        } catch (IOException e) {
            ErrorLogger.logError("[DataPersistenceManager] Failed to save GUI data: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static Map<String, String> loadGUIData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(GUI_DATA_FILE))) {
            Map<String, String> guiData = (Map<String, String>) ois.readObject();
            Logger.log("[DataPersistenceManager] GUI data loaded successfully.");
            return guiData;
        } catch (IOException | ClassNotFoundException e) {
            ErrorLogger.logError("[DataPersistenceManager] Failed to load GUI data: " + e.getMessage());
            return new HashMap<>();
        }
    }
}
