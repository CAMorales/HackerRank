package com.morac.algorithms.dynamicprogramming;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by azazel on 17/04/16.
 */
public class FibonacciModified {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger first=BigInteger.valueOf(in.nextInt());
        BigInteger second=BigInteger.valueOf(in.nextInt());
        int n=in.nextInt();
        BigInteger third=BigInteger.valueOf(n);
        for(int i = 2;i<n;++i){
            third=first.add(second.pow(2));
            first=second;
            second=third;
        }
        System.out.println(third);
    }
}
