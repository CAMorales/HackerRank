package com.morac.algorithms.gametheory;

import java.util.Scanner;

/**
 * Created by azazel on 17/04/16.
 */
public class ChocolateInBox {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int arr[] = new int[n];
        int xor=0;
        int res=0;
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
            xor^=arr[i];
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>(arr[i]^xor))
                res++;
        }
        System.out.println(res);
    }
}
