package com.morac.april2016worldcontest;

import java.util.Scanner;

/**
 * Created by azazel on 29/04/16.
 */
public class BeautifulTriplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int arr[] = new int[n];
        int arrNum[] = new int[20041];
        int res = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            arrNum[arr[i]]=1;
        }
        int val;
        for (int i = 0; i < n-2 ; i++) {
            val=1;
            for (int j = 1; j < 3; j++) {
                val+=arrNum[arr[i]+j*d];
            }
            if (val==3)
                res++;
        }
        System.out.println(res);
    }
}
