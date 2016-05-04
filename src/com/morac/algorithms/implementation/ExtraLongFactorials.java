package com.morac.algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Claudio Morales on 04/05/2016.
 */
public class ExtraLongFactorials {

    private static final BigInteger[] factorials = new BigInteger[101];

    private static BigInteger factorial(int num) {
        if (num == 1)
            return new BigInteger("1");
        if (factorials[num] != null)
            return factorials[num];
        return factorials[num] = new BigInteger(String.valueOf(num)).multiply(factorial(num - 1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
    }
}
