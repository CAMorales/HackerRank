package com.morac.projecteulerplus;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 18/04/2016.
 */
public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        long n,a,b, temp, count;
        while(t-->0){
            n=in.nextLong();
            count=0;
            a=1;
            b=1;
            while(b<=n){
                temp=b;
                b+=a;
                a=temp;
                if (b%2==0 && b<=n)
                    count+=b;
            }
            System.out.println(count);
        }
    }
}
