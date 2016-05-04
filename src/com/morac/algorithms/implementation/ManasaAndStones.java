package com.morac.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 04/05/2016.
 */
public class ManasaAndStones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a,b,ta,tb, stones;
        while (t-->0){
            stones=in.nextInt();
            ta=in.nextInt();
            tb=in.nextInt();
            if (ta>tb){
                a=tb;
                b=ta;
            }else{
                a=ta;
                b=tb;
            }
            if (a==b){
                System.out.print(((a*(stones-1)))+ " ");
            }else{
                for (int i = 0; i <stones; i++) {
                    System.out.print(((a*(stones-i-1) + b*(i)))+ " ");
                }
            }
            System.out.println();
        }
    }
}
