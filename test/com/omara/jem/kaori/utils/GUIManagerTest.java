package com.omara.jem.kaori.utils;

public class GUIManagerTest {
    public static void main(String[] args) {
        Logger.log("[GUIManagerTest] Running tests...");

        GUIManager guiManager = new GUIManager();
        String aiName = "TestClone";

        // Test assignRandomAppearance
        Logger.log("[TEST] Testing assignRandomAppearance...");
        guiManager.assignRandomAppearance(aiName);

        // Test customizeAppearance
        Logger.log("[TEST] Testing customizeAppearance...");
        String[] customOptions = {"Hair: Blonde", "Eyes: Green"};
        guiManager.customizeAppearance(aiName, customOptions);

        // Test applyAppearance
        Logger.log("[TEST] Testing applyAppearance...");
        guiManager.applyAppearance(aiName);

        Logger.log("[GUIManagerTest] All tests completed successfully.");
    }
}
