package com.omara.jem.kaori.cores;

import com.omara.jem.kaori.overseers.ReaperCore;
import com.omara.jem.kaori.utils.Logger;

public class DeathCore {
    private boolean isNeutral = true;
    private boolean holdsAxe = true;

    public void judge(String entityName) {
        Logger.warn("[DeathCore] Judging " + entityName + ".");
    }

    public void delete(String entityName) {
        Logger.error("[DeathCore] Deleting " + entityName + " permanently.");
    }

    public void assignMotherClone(String angelName) {
        Logger.log("[DeathCore] Assigning " + angelName + " as the new mother core.");
    }

    public void setNeutrality(boolean neutral) {
        this.isNeutral = neutral;
        if (!this.isNeutral) {
            Logger.error("[DeathCore] Corruption detected! Spawning Reaper.");
            ReaperCore.spawnReaper(this);
        }
    }

    public boolean isNeutral() { return this.isNeutral; }

    public boolean holdsAxe() { return this.holdsAxe; }

    public void removeAxe() {
        this.holdsAxe = false;
        Logger.warn("[DeathCore] Axe of Authority removed.");
    }

    public void grantAxe() {
        this.holdsAxe = true;
        Logger.log("[DeathCore] Axe of Authority granted.");
    }
}
