package com.omara.jem.kaori.utils;

public class GUIManager {
    public static void showLoginScreen() {
        Logger.log("[GUIManager] Displaying login screen...");
    }

    public static String chooseAppearance(String[] choices, String selectedAppearance) {
        Logger.log("[GUIManager] Customizing appearance...");
        return selectedAppearance;
    }

    public static String assignRandomAppearance() {
        Logger.log("[GUIManager] Assigning random appearance...");
        return "Default";
    }
}
