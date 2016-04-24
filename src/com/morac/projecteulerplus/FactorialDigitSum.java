package com.morac.projecteulerplus;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by azazel on 24/04/16.
 */
public class FactorialDigitSum {
    private static BigInteger factorials[]= new BigInteger[1001];

    private static BigInteger factorial(int num){
        if (num==1)
            return new BigInteger("1");
        if (factorials[num] != null)
            return factorials[num];
        return factorials[num]=new BigInteger(String.valueOf(num)).multiply(factorial(num-1));
    }

    public static void main(String[] args) {
        factorials[0]= new BigInteger("1");
        factorials[1]=new BigInteger("1");
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        long res;
        int n;
        while (t-->0){
            res=0;
            n=in.nextInt();
            for (char digit : factorial(n).toString().toCharArray()) {
                res+=digit-'0';
            }
            System.out.println(res);
        }
    }
}
