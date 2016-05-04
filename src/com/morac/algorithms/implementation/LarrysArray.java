package com.morac.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 03/05/2016.
 */
public class LarrysArray {
    private static int merge(int arr[], int temp[], int left, int mid, int right) {
        int i = left;
        int j = mid;
        int totalInv = 0;
        for (int k = left; k < right; k++) {
            if (i < mid && (j >= right || arr[i] <= arr[j])) {
                temp[k] = arr[i++];
            } else {
                temp[k] = arr[j++];
                totalInv += mid - i;
            }
        }
        return totalInv;
    }

    private static void copyArray(int arr[], int temp[], int left, int right) {
        for (int i = left; i < right; i++) {
            arr[i] = temp[i];
        }
    }

    private static int mergeSort(int arr[], int temp[], int left, int right) {
        int totalInv = 0;
        if (!(right - left < 2)) {
            int mid = (right + left) / 2;
            totalInv= mergeSort(arr, temp, mid, right);
            totalInv+= mergeSort(arr, temp, left, mid);
            totalInv+= merge(arr, temp, left, mid, right);
            copyArray(arr, temp, left, right);
        }
        return totalInv;
    }

    private static int solution(int arr[], int n) {
        int temp[] = new int[n];
        return mergeSort(arr, temp, 0, n);
    }

    private static String naiveSolution(int arr[]){
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
            System.out.println((solution(vec, n)&1)==0?"YES":"NO");
        }
    }
}
