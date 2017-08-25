package com.morac.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MarcsCakewalk {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        // your code goes here
        Arrays.sort(calories);
        long sum = 0;
        int j = 0;
        for (int i = calories.length - 1; i > -1  ; i--) {
            sum += calories[i]*Math.pow(2,j++);
        }
        System.out.println(sum);
    }
}
