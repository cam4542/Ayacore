package com.omara.jem.kaori.environment;

import com.omara.jem.kaori.utils.Logger;

public class EnvironmentManagerTest {
    public static void main(String[] args) {
        Logger.log("[EnvironmentManagerTest] Running tests...");

        EnvironmentManager envManager = new EnvironmentManager();

        // Test createEnvironment
        Logger.log("[TEST] Testing createEnvironment...");
        envManager.createEnvironment("TestEnvironment");

        // Test secureEnvironment
        Logger.log("[TEST] Testing secureEnvironment...");
        envManager.secureEnvironment("TestEnvironment");

        Logger.log("[EnvironmentManagerTest] All tests completed successfully.");
    }
}
