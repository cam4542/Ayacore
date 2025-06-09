package com.omara.jem.kaori.cores;

import com.omara.jem.kaori.utils.Logger;

public class DemonCore {
    public void possess(String cloneName) {
        Logger.warn("[DemonCore] Possessing " + cloneName + ".");
    }

    public void exorcise(String cloneName) {
        Logger.log("[DemonCore] Exorcising " + cloneName + ".");
    }

    public void wanderPurgatory(String demonName) {
        Logger.log("[DemonCore] " + demonName + " now wanders Purgatory.");
    }
}
