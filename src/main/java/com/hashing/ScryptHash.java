/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hashing;

/**
 *
 * @author YusufDS
 */
import org.bouncycastle.crypto.generators.SCrypt;
import java.util.Base64;
import java.security.SecureRandom;

public class ScryptHash {

    public static String hash(String password) {
        byte[] salt = new byte[16];
        new SecureRandom().nextBytes(salt);
        byte[] hash = SCrypt.generate(password.getBytes(), salt, 16384, 8, 1, 32);
        return Base64.getEncoder().encodeToString(salt) + ":" + Base64.getEncoder().encodeToString(hash);
    }
}
