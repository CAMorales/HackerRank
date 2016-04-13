package com.morac.algorithms.sorting;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 12/04/2016.
 */
public class CountingSortOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]=new int[100];
        int s = in.nextInt();
        for (; s > 0 ; s--) {
            arr[in.nextInt()]++;
        }
        for (;s<arr.length;++s){
            System.out.print(arr[s]+" ");
        }
    }
}
