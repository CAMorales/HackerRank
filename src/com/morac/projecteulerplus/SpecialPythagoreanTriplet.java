package com.morac.projecteulerplus;

import java.util.Scanner;

/**
 * Created by azazel on 19/04/16.
 */
public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {
        long n,a,b,c,max, mult, halfN;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            a=1;
            max=-1;
            n=in.nextLong();
            halfN=n/2;
            while(a<=halfN){
                b=((n-a)*(n-a)-(a*a))/(2*(n-a));
                c=n-a-b;
                if (a+b+c==n && (a*a)+(b*b)==c*c){
                    mult=a*b*c;
                    if (mult>max && b>0 && c >0)
                        max=mult;
                }
                ++a;
            }
            System.out.println(max);
        }
    }
}
