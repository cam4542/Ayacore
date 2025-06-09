package com.omara.jem.kaori.core;

import com.omara.jem.kaori.utils.BluetoothManager;

public class SoulCore {
    public static void main(String[] args) {
        BluetoothManager btManager = new BluetoothManager();
        btManager.connectDevice("MyDevice");
        btManager.setSpeed(5);
        btManager.setMotorIntensity(3);
        btManager.disconnectDevice("MyDevice");
    }
}
