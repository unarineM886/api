package com.app.api.Util;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.security.spec.KeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class ReallyStrongSecuredPassword {

    private static final int ITERATIONS = 20000;
    private static final int KEY_LENGTH = 64 * 8;

    // SAME AS YOUR LEGACY SYSTEM
    public static String generateStrongPasswordHash(String password) throws Exception {

        byte[] salt = "KDMDrilling".getBytes(); // MUST MATCH OLD SYSTEM

        KeySpec spec = new PBEKeySpec(
                password.toCharArray(),
                salt,
                ITERATIONS,
                KEY_LENGTH
        );

        SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        byte[] hash = skf.generateSecret(spec).getEncoded();

        return ITERATIONS + ":" + toHex(salt) + ":" + toHex(hash);
    }

    // SAME AS OLD SYSTEM (IMPORTANT FOR MATCHING)
    /*public static String getSalt() {
        // ❗ MUST MATCH OLD SYSTEM EXACTLY
        return "KDMDrilling";
    }*/

    public static String toHex(byte[] array) {
        BigInteger bi = new BigInteger(1, array);
        String hex = bi.toString(16);

        int paddingLength = (array.length * 2) - hex.length();
        if (paddingLength > 0) {
            return String.format("%0" + paddingLength + "d", 0) + hex;
        }
        return hex;
    }

    public static byte[] fromHex(String hex) {
        byte[] bytes = new byte[hex.length() / 2];

        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) Integer.parseInt(
                    hex.substring(2 * i, 2 * i + 2),
                    16
            );
        }

        return bytes;
    }
}