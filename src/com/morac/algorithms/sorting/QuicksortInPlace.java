package com.morac.algorithms.sorting;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 12/04/2016.
 */
public class QuicksortInPlace {

    public static int partition(int arr[], int index1, int index2){
        int pivot=arr[index2];
        int pivotIndex = index1;
        for (int j = index1; j <= index2; j++) {
            if (arr[j]<pivot){
                swap(arr, pivotIndex, j);
                ++pivotIndex;
            }
        }
        swap(arr, pivotIndex, index2);
        return pivotIndex;
    }

    public static void quicksort(int arr[], int index1, int index2){
        if (index1 < index2 ){
            int pivotIndex=partition(arr, index1, index2);
            printArr(arr);
            quicksort(arr, index1, pivotIndex-1);
            quicksort(arr, pivotIndex+1, index2);
        }

    }

    public static void swap(int arr[], int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        quicksort(arr, 0, arr.length-1);
    }
}
