package com.omara.jem.kaori.utils;

public class BluetoothManager {
    public void connectToDevice(String deviceName) {
        System.out.println("[BluetoothManager] Connecting to device: " + deviceName);
    }

    public void setSpeed(int speed) {
        System.out.println("[BluetoothManager] Setting speed to " + speed);
    }

    public void setMotorIntensity(int intensity) {
        System.out.println("[BluetoothManager] Setting motor intensity to " + intensity);
    }

    public void disconnectDevice(String deviceName) {
        System.out.println("[BluetoothManager] Disconnecting from device: " + deviceName);
    }
}
