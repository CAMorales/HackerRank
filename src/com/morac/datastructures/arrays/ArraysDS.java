package com.morac.datastructures.arrays;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 13/04/2016.
 */
public class ArraysDS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        while(n-- > 0){
            System.out.print(arr[n] + " ");
        }
    }
}
