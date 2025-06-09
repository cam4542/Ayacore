package com.omara.jem.kaori.utils;

public class BluetoothManager {
    public void connectDevice(String deviceName) {
        System.out.println("Connecting to device: " + deviceName);
    }

    public void disconnectDevice(String deviceName) {
        System.out.println("Disconnecting from device: " + deviceName);
    }

    public void setSpeed(int speed) {
        System.out.println("Setting speed to: " + speed);
    }

    public void setMotorIntensity(int intensity) {
        System.out.println("Setting motor intensity to: " + intensity);
    }
}
