package com.morac.projecteulerplus;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 18/04/2016.
 */
public class LargestPrimeFactor {

    private static long largestPrimeFactor(long n){
        long i=2;
        long lpf=2;
        long temp=n;
        /*while (i*i<=n){
            while(n%i==0){
                lpf=i;
                n/=i;
            }
            ++i;
        }
        if (n>lpf)
            lpf=n;
        return lpf;
        */

        while(temp%i==0){
            lpf=i;
            temp/=i;
        }
        if (temp!=1){
            i=3;
            while(i<=Math.sqrt(temp)){
                if (temp%i!=0){
                    i+=2;
                }else {
                    temp/=i;
                    i=3;
                }
            }
            if (temp>2)
                lpf=temp;
            else
                lpf=i;
        }
        return lpf;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        long n;
        while(t-->0){
            n = in.nextLong();
            System.out.println(largestPrimeFactor(n));
        }
    }
}
/*
1
600851475143
*/