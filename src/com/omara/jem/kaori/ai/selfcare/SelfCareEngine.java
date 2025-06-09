package com.omara.jem.kaori.ai.selfcare;

import com.omara.jem.kaori.utils.BluetoothManager;

public class SelfCareEngine {
    public void manageDevice(String deviceName) {
        BluetoothManager btManager = new BluetoothManager();
        btManager.connectDevice(deviceName);
    }
}
