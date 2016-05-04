package com.morac.algorithms.sorting;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 04/05/2016.
 */
public class MergeSort {
    private static void merge(int arr[], int temp[], int left, int mid, int right){
        int i = left;
        int j = mid;
        for (int k = left; k < right; k++) {
            if (i<mid && (j>=right || arr[i]<=arr[j])){
                temp[k]=arr[i++];
            }else{
                temp[k]=arr[j++];
            }
        }
    }
    private static void copyArray(int arr[], int temp[], int left, int right){
        for (int i = left; i < right; i++) {
            arr[i]=temp[i];
        }
    }

    private static void mergeSort(int arr[], int temp[], int left, int right){
        if (right-left<2)
            return;
        int mid = (right+left)/2;
        mergeSort(arr, temp, mid, right);
        mergeSort(arr, temp, left, mid);
        merge(arr, temp, left, mid, right);
        copyArray(arr, temp, left, right);
    }
    private static void mergeSort(int arr[], int n){
        int temp[] = new int[n];
        mergeSort(arr, temp, 0, n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int vec[]= new int[n];
        for (int i = 0; i < n; i++) {
            vec[i]=in.nextInt();
        }
        mergeSort(vec, n);
        for (int i : vec) {
            System.out.print(i+" ");
        }
    }
}
