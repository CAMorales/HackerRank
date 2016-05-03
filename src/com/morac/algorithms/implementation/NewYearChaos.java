package com.morac.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 03/05/2016.
 */
public class NewYearChaos {

    private static int vec[]=new int[100000];

    private static void solution(int n){
        int total=0;
        int curInversion;
        for (int i = 0; i < n-1; i++) {
            curInversion=0;
            for (int j = i+1; j < n; j++) {
                if (vec[i]>vec[j]){
                    total++;
                    curInversion++;
                }
                if (curInversion>2){
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n;
        while (t-- > 0) {
            n = in.nextInt();
            for (int i = 0; i < n; i++) {
                vec[i] = in.nextInt();
            }
            solution(n);
        }
    }
}
