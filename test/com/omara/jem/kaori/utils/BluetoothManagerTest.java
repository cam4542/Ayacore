package com.omara.jem.kaori.utils;

public class BluetoothManagerTest {
    public static void main(String[] args) {
        Logger.log("[BluetoothManagerTest] Running tests...");

        BluetoothManager btManager = new BluetoothManager();

        String deviceName = "TestBluetoothDevice";

        // Test connectToDevice
        Logger.log("[TEST] Testing connectToDevice...");
        btManager.connectToDevice(deviceName);

        // Test setSpeed
        Logger.log("[TEST] Testing setSpeed...");
        btManager.setSpeed(deviceName, 5);

        // Test setMotorIntensity
        Logger.log("[TEST] Testing setMotorIntensity...");
        btManager.setMotorIntensity(deviceName, 3);

        // Test disconnectDevice
        Logger.log("[TEST] Testing disconnectDevice...");
        btManager.disconnectDevice(deviceName);

        Logger.log("[BluetoothManagerTest] All tests completed successfully.");
    }
}
