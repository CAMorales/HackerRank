package com.morac.algorithms.sorting;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 11/04/2016.
 */
public class RunningTimeOfAlgorithms {
    public static void insertionSortPart2(int[] ar)
    {
        // Fill up the code for the required logic here
        // Manipulate the array as required
        // The code for Input/Output is already provided
        int res=0;
        for(int i=1;i<ar.length;i++){
            int value = ar[i];
            int j=i-1;
            while(j>=0 && ar[j]>value){
                ar[j+1]=ar[j];
                --j;
                ++res;
            }
            ar[j+1]=value;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionSortPart2(ar);

    }
}
