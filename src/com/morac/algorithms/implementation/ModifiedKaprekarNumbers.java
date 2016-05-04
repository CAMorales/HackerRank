package com.morac.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by azazel on 1/05/16.
 */
public class ModifiedKaprekarNumbers {
    private static final int kaprekarNumbers[] = {1, 9, 45, 55, 99, 297, 703, 999, 2223, 2728, 4950, 5050, 7272, 7777, 9999, 17344, 22222, 77778, 82656, 95121, 99999, 142857, 148149, 181819, 187110, 208495, 318682, 329967, 351352, 356643, 390313, 461539, 466830, 499500, 500500, 533170};

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p= in.nextInt();
        int q= in.nextInt();
        boolean flag=false;
        for (int num :
                kaprekarNumbers) {
            if (num >= p && num <= q){
                System.out.print(num +" ");
                flag=true;
            }
        }
        if (!flag)
            System.out.println("INVALID RANGE");
        else
            System.out.println();
    }
}
