package com.morac.java.advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMD5 {
    static String hash(String algo, String s) throws NoSuchAlgorithmException {
        MessageDigest m = MessageDigest.getInstance(algo);
        m.reset();
        m.update(s.getBytes(), 0, s.length());
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : m.digest()) {
            stringBuffer.append(String.format("%02x", b));
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        try {
            s = hash("MD5", s);
            System.out.println(s);
        } catch (NoSuchAlgorithmException e) {
            System.out.println(s);
        }

    }
}
