package com.morac.algorithms.sorting;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 12/04/2016.
 */
public class RunningTimeOfQuicksort {

    public static int swapCount=0;

    public static int insertionSort(int[] ar){
        int count=0;
        for(int i=1;i<ar.length;i++){
            int value = ar[i];
            int j=i-1;
            while(j>=0 && ar[j]>value){
                ar[j+1]=ar[j];
                --j;
                ++count;
            }
            ar[j+1]=value;
        }
        return count;
    }

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
            quicksort(arr, index1, pivotIndex-1);
            quicksort(arr, pivotIndex+1, index2);
        }

    }

    public static void swap(int arr[], int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        ++swapCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar1 = new int[s];
        int[] ar2 = new int[s];
        for(int i=0;i<s;i++){
            ar1[i]=in.nextInt();
            ar2[i]=ar1[i];
        }
        int count = insertionSort(ar1);
        quicksort(ar2, 0, ar2.length-1);
        System.out.println(count - swapCount);
    }
}
/*
10
1 3 4 5 2 7 8 9 6 10

10
10 9 8 7 6 5 4 3 2 1

7
1 3 9 8 2 7 5
 */