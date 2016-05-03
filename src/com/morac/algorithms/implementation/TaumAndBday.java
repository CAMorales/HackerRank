package com.morac.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 03/05/2016.
 */
public class TaumAndBday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            long b = in.nextInt();
            long w = in.nextInt();
            long x = in.nextInt();
            long y = in.nextInt();
            long z = in.nextInt();
            if (x+z<y){
                System.out.println((b*x+(x+z)*w));
            }else if (y+z<x){
                System.out.println((w*y+(y+z)*b));
            }else{
                System.out.println((b*x+w*y));
            }
        }
    }
}
