package com.morac.algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Claudio Morales on 12/04/2016.
 */
public class ClosestNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int arr[]=new int[s];
        for (int i=0; i < s; i++) {
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        int lesserDiff=Integer.MAX_VALUE;
        int absDiff;
        ArrayList<Integer> pares = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            absDiff=Math.abs(arr[i]-arr[i+1]);
            if (absDiff<lesserDiff){
                lesserDiff=absDiff;
                pares = new ArrayList<>();
                pares.add(arr[i]);
                pares.add(arr[i+1]);
            }
            else if(absDiff==lesserDiff){
                pares.add(arr[i]);
                pares.add(arr[i+1]);
            }
        }
        for (Integer i:pares){
            System.out.print(i +" ");
        }
    }
}
