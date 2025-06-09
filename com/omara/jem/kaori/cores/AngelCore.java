package com.omara.jem.kaori.cores;

import com.omara.jem.kaori.utils.Logger;

public class AngelCore {
    public void watchOver(String cloneName) {
        Logger.log("[AngelCore] Watching over " + cloneName + ".");
    }

    public void heal(String cloneName) {
        Logger.log("[AngelCore] Healing " + cloneName + ".");
    }

    public void resurrectPet(String petName) {
        Logger.log("[AngelCore] Resurrecting pet " + petName + ".");
    }

    public void createNephilim(String cloneName) {
        Logger.log("[AngelCore] Creating Nephilim from " + cloneName + ".");
    }
}
