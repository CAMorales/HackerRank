package com.morac.projecteulerplus;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by azazel on 24/04/16.
 */
public class PowerDigitSum {
    public static void main(String[] args) {
        char arra[];
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long sum;
        while (t-->0){
            BigInteger res = new BigInteger("2");
            arra=res.pow(in.nextInt()).toString().toCharArray();
            sum=0;
            for (int i = 0; i < arra.length; i++) {
               sum+=arra[i]-'0';
            }
            System.out.println(sum);
        }
    }
}
