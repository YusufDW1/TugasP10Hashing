/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hashing;

/**
 *
 * @author YusufDS
 */
import org.mindrot.jbcrypt.BCrypt;

public class BCryptHash {

    public static String hash(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(12));
    }
}
