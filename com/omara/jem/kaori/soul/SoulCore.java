package com.omara.jem.kaori.soul;

import com.omara.jem.kaori.utils.Logger;
import java.nio.file.*;
import java.security.MessageDigest;

public class SoulCore {
    private static final String AUTHORIZED_HOSTNAME = "MY-SECURE-PC";
    private static final String LICENSE_FILE = "license.key";

    public static SoulCore getInstance() {
        return new SoulCore();
    }

    public void initialize() {
        Logger.log("[SoulCore] Initializing...");
        if (!checkEnvironment() || !checkLicense()) {
            Logger.error("[SoulCore] Unauthorized environment or missing license. Self-destructing.");
            selfDestruct();
            System.exit(1);
        }
        Logger.log("[SoulCore] System initialized successfully.");
    }

    private boolean checkEnvironment() {
        String hostname = System.getenv("COMPUTERNAME");
        return AUTHORIZED_HOSTNAME.equalsIgnoreCase(hostname);
    }

    private boolean checkLicense() {
        return Files.exists(Paths.get(LICENSE_FILE));
    }

    private void selfDestruct() {
        try {
            Logger.warn("[SoulCore] Self-destruct sequence triggered.");
            Files.deleteIfExists(Paths.get("bin/com/omara/jem/kaori/AyaCore.class"));
            Logger.warn("[SoulCore] Critical files deleted.");
        } catch (Exception e) {
            Logger.error("[SoulCore] Self-destruct failed: " + e.getMessage());
        }
    }
}
