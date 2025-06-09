package com.omara.jem.kaori.utils;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.util.Base64;

public class EncryptedStorage {

    private static final String KEY = "MySecretKey12345"; // 16 chars AES key

    public static void save(String fileName, String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec secretKey = new SecretKeySpec(KEY.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] encrypted = cipher.doFinal(data.getBytes());
        String encoded = Base64.getEncoder().encodeToString(encrypted);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(encoded);
        }
    }

    public static String load(String fileName) throws Exception {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String encoded = reader.readLine();
            byte[] decoded = Base64.getDecoder().decode(encoded);

            Cipher cipher = Cipher.getInstance("AES");
            SecretKeySpec secretKey = new SecretKeySpec(KEY.getBytes(), "AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            return new String(cipher.doFinal(decoded));
        }
    }
}
