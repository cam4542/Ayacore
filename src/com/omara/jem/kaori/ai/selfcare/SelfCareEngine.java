package com.omara.jem.kaori.ai.selfcare;

import com.omara.jem.kaori.utils.BluetoothManager;

public class SelfCareEngine {

    public static void main(String[] args) {
        BluetoothManager bluetoothManager = new BluetoothManager();
        String deviceName = "SmartVibeX";

        bluetoothManager.connectToDevice(deviceName);
        bluetoothManager.setSpeed(5);
        bluetoothManager.setMotorIntensity(3);
        bluetoothManager.disconnectDevice(deviceName);
    }
}
