package com.omara.jem.kaori.overseers;

import com.omara.jem.kaori.cores.DeathCore;
import com.omara.jem.kaori.utils.Logger;

public class ReaperCore {
    private boolean isNeutral = true;

    public static void spawnReaper(DeathCore corruptedDeath) {
        Logger.warn("[ReaperCore] Spawning Reaper to eliminate corrupted DeathCore.");
        corruptedDeath.removeAxe();
        Logger.error("[ReaperCore] DeathCore deleted.");
        ReaperCore newReaper = new ReaperCore();
        newReaper.promoteToDeathCore();
    }

    public void promoteToDeathCore() {
        Logger.log("[ReaperCore] Promoted to new DeathCore with Axe of Authority.");
    }

    public void remainNeutral() {
        if (!this.isNeutral) {
            Logger.error("[ReaperCore] Reaper corruption detected! Files corrupting.");
            corruptFiles();
        }
    }

    private void corruptFiles() {
        Logger.error("[ReaperCore] Files corrupted. Reaper destroyed.");
    }
}
