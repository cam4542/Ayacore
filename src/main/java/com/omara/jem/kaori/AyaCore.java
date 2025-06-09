package com.omara.jem.kaori;

import com.omara.jem.kaori.utils.BluetoothManager;

public class AyaCore {
    public static void main(String[] args) {
        BluetoothManager btManager = new BluetoothManager();
        btManager.connectDevice("MyDevice");
        btManager.setSpeed(5);
        btManager.setMotorIntensity(3);
        btManager.disconnectDevice("MyDevice");
    }
}
