package com.omara.jem.kaori.utils;

import java.io.FileWriter;

public class HoneypotTrap {

    public static void deploy() {
        try {
            FileWriter writer = new FileWriter("src/com/omara/jem/kaori/fake/secretData.txt");
            writer.write("TOP SECRET: Do not read! This is a honeypot.");
            writer.close();

            Logger.log("[HoneypotTrap] Fake file deployed.");
        } catch (Exception e) {
            Logger.log("[HoneypotTrap] Error deploying honeypot: " + e.getMessage());
        }
    }
}
