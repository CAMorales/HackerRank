package com.morac.projecteulerplus;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 20/04/2016.
 */
public class LargeSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        long result=0;
        String nums[] = new String[n];
        for (int i = 0; i < n; i++) {
            nums[i]=in.next();
        }
        System.out.println(result);
    }
}
