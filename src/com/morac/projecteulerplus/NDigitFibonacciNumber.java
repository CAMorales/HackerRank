package com.morac.projecteulerplus;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by azazel on 24/04/16.
 */
public class NDigitFibonacciNumber {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n;
//        double Phi= (1+Math.sqrt(5))/2.0;
        double phi = (Math.sqrt(5)-1)/2.0;
        while (t-->0){
            n=in.nextInt();
            if (n==1)
                System.out.println(1);
            else if (n>1)
                System.out.println((int)Math.ceil(-1*((n-1)*Math.log10(10)+Math.log10(5)/2.0) / Math.log10(phi)));
            else
                System.out.println(0);
        }
    }
//    ceil(-1*(((no[j]-1)*log10(10))+(log10(5)/2.0))/(log10(phi)))
}
