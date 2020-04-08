package com.morac.projecteulerplus;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Claudio Morales on 20/04/2016.
 */
public class LargeSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() - 1;
        BigInteger num = new BigInteger(in.next());
        while (n-- > 0) {
            num = num.add(new BigInteger(in.next()));
        }
        System.out.println(num.toString().substring(0, 10));
    }
}
