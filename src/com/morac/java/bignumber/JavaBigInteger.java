package com.morac.java.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by azazel on 23/04/16.
 */
public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
