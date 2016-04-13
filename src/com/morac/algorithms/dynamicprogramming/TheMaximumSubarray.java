package com.morac.algorithms.dynamicprogramming;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 13/04/2016.
 */
public class TheMaximumSubarray {

    public static int maxSubArray(int []arr){
        int maxEndingHere =arr[0], maxSoFar=arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i],maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n, sumCont, maxNegVal, sumNonCont, arr[];
        while(t-- >0 ){
            n = in.nextInt();
            arr = new int[n];
            sumNonCont=0;
            maxNegVal=Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i]=in.nextInt();
                if (arr[i]>0){
                    sumNonCont+=arr[i];
                }else{
                    if (arr[i]>maxNegVal){
                        maxNegVal=arr[i];
                    }
                }
            }
            if (sumNonCont==0){
                sumNonCont=sumCont=maxNegVal;
            }else{
                sumCont=maxSubArray(arr);
            }
            System.out.println(sumCont +" " +sumNonCont);
        }
    }
}
