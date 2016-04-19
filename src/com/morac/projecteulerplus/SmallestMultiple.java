package com.morac.projecteulerplus;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 19/04/2016.
 */
public class SmallestMultiple {

    private static int gcd(int a, int b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    private static int lcm(int a, int b){
        if (a==0||b==0)
            return 0;
        return (a*b)/gcd(a,b);
    }
    private static final int PRIMES[]={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41};//, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

    public static void main(String[] args) {
        long n,k;
        int i;
        long res;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            n = in.nextInt();
            i=0;
            res=1;
            while(PRIMES[i]<=n){
                k=1;
                while(Math.pow(PRIMES[i],k)<=n){
                    ++k;
                }
                res*=Math.pow(PRIMES[i],k-1);
                ++i;
            }
            System.out.println(res);
        }
    }
}


/*
Pro tip: M is divisible by all numbers from 1 to N iff M is equal to the product of all prime powers p^k
where p is prime and divides M, and p < N, and k is the largest integer such that p^k < N.
For example, 2520 = 2^3 * 3^2 * 5 * 7.
 */