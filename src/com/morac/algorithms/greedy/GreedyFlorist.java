package com.morac.algorithms.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class GreedyFlorist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = 0, accum;
        Integer[] costs = new Integer[n];
        for (int i = 0; i < n; i++) {
            costs[i] = scanner.nextInt();
        }
        Arrays.sort(costs, Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            accum = Math.floorDiv(i, k)+1;
            result += costs[i] * accum;
        }
        System.out.println(result);
    }
}
