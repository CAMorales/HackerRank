package com.morac.algorithms.sorting;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 12/04/2016.
 */
public class FindTheMedian {

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

    public static void swap(int arr[], int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    public static int quickSelect(int arr[], int index1, int index2, int k){
        while(index1!=index2){
            int pivotIndex=partition(arr, index1, index2);
            if (k==pivotIndex)
                return arr[k];
            else if (k<pivotIndex)
                index2=pivotIndex-1;
            else
                index1=pivotIndex+1;
        }
        return arr[index1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int arr[]=new int[s];
        for (int i=0; i < s; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println(quickSelect(arr, 0, arr.length-1, arr.length/2));
    }
}
