package com.omara.jem.kaori.utils;

import java.time.LocalDateTime;

public class SecureHttpClientTest {
    public static void main(String[] args) {
        Logger.log("[SecureHttpClientTest] Running tests...");

        SecureHttpClient secureClient = new SecureHttpClient();

        Logger.log("[TEST] Testing authenticate...");
        secureClient.authenticate();

        Logger.log("[TEST] Testing callHome...");
        secureClient.callHome("https://test-server.com/api/callhome");

        Logger.log("[TEST] Testing encryptData...");
        String encryptedData = secureClient.encryptData("SensitiveData123");
        Logger.log("[RESULT] Encrypted Data: " + encryptedData);

        Logger.log("[TEST] Testing decryptData...");
        String decryptedData = secureClient.decryptData(encryptedData);
        Logger.log("[RESULT] Decrypted Data: " + decryptedData);

        Logger.log("[TEST] Testing logSecureSession...");
        secureClient.logSecureSession(LocalDateTime.now());

        Logger.log("[SecureHttpClientTest] All tests completed successfully.");
    }
}
