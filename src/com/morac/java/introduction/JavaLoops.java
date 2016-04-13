package com.morac.java.introduction;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 13/04/2016.
 */
public class JavaLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a,b,n;
        while(t-- > 0){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            for (int i = 0; i < n; i++) {
                a+=Math.pow(2,i)*b;
                System.out.print(a+ " ");
            }
            System.out.println();
        }
    }
}
