package com.morac.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 03/05/2016.
 */
public class NewYearChaos {

    private static void solution(int vec[], int n) {
        int people[]= new int[n+1];
        int total=0;
        boolean allScanned=false;
        while(!allScanned){
            allScanned=true;
            for (int i = 0; i < n - 1; i++) {
                if (vec[i]>vec[i+1]){
                    people[vec[i]]++;
                    if (people[vec[i]]>2){
                        System.out.println("Too chaotic");
                        return;
                    }
                    total++;
                    int temp=vec[i];
                    vec[i]=vec[i+1];
                    vec[i+1]=temp;
                    allScanned=false;
                }
            }
        }
        System.out.println(total);
    }

    private static void naiveSolution(int vec[], int n) {
        int total = 0;
        int curInversion;
        for (int i = 0; i < n - 1; i++) {
            curInversion = 0;
            for (int j = i + 1; j < n; j++) {
                if (vec[i] > vec[j]) {
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
        int vec[];
        while (t-- > 0) {
            n = in.nextInt();
            vec = new int[n];
            for (int i = 0; i < n; i++) {
                vec[i] = in.nextInt();
            }
//            naiveSolution(vec, n);
            solution(vec, n);
        }
    }
}
