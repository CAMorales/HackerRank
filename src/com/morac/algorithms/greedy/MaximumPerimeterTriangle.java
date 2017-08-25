package com.morac.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumPerimeterTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] perimeters = new int[n];
        for (int i = 0; i < n; i++) {
            perimeters[i] = scanner.nextInt();
        }
        Arrays.sort(perimeters);
        int i = n-3;
        while (i>=0 && perimeters[i] + perimeters[i+1] <= perimeters[i+2] ){
            i--;
        }

        if(i>=0){
            System.out.println(perimeters[i] + " " + perimeters[i+1] + " "+ perimeters[i+2] + " ");
        }else {
            System.out.println(-1);
        }
    }
}
