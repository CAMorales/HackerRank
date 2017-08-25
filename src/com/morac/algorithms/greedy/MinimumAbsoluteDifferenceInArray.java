package com.morac.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifferenceInArray {

    private static int minimumAbsoluteDifference(int n, int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int val;
        for (int i = 0; i < arr.length - 1 ; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
                val = Math.abs(arr[i]-arr[i+1]);
                if(val < min)
                    min = val;
//            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = minimumAbsoluteDifference(n, arr);
        System.out.println(result);
        in.close();
    }
}
