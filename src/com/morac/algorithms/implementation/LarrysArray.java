package com.morac.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 03/05/2016.
 */
public class LarrysArray {
    private static String solution(int arr[]){
        int total=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    total++;
                }
            }
        }
        // total % 2 == 0
        if ((total&1)==0){
            return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n, vec[];
        while (t-- > 0) {
            n = in.nextInt();
            vec = new int[n];
            for (int i = 0; i < n; i++) {
                vec[i] = in.nextInt();
            }
            System.out.println(solution(vec));
        }
    }
}
