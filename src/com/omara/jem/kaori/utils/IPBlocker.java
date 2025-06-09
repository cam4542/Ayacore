package com.omara.jem.kaori.utils;

import java.util.HashSet;

public class IPBlocker {
    private static HashSet<String> blockedIPs = new HashSet<>();

    public static void blockIP(String ip) {
        blockedIPs.add(ip);
        Logger.log("[IPBlocker] Blocked IP: " + ip);
    }

    public static boolean isBlocked(String ip) {
        return blockedIPs.contains(ip);
    }
}
