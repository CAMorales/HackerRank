package com.morac.algorithms.sorting;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 11/04/2016.
 */
public class QuicksortOne {
    static void partition(int[] ar) {
        int pivot=ar[0];
        int []left=new int[ar.length];
        int []right=new int[ar.length];
        int i=0,j=0;
        for (int k = 1; k < ar.length; k++) {
            if (ar[k]<pivot)
                left[i++]=ar[k];
            else
                right[j++]=ar[k];
        }
        for (int k = 0; k < i; k++) {
            System.out.print(left[k]+ " ");
        }
        System.out.print(pivot);
        for (int k = 0; k < j; k++) {
            System.out.print(right[k]+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        partition(ar);
    }
}
