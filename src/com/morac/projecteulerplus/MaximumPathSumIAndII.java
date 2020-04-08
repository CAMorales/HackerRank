package com.morac.projecteulerplus;

import java.util.Scanner;

/**
 * Created by azazel on 24/04/16.
 */
public class MaximumPathSumIAndII {
    public static void main(String[] args) {
        int[][] triangle;
        int rows;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            rows = in.nextInt();
            triangle = new int[rows][];
            for (int i = 0; i < rows; i++) {
                triangle[i] = new int[i + 1];
                for (int j = 0; j <= i; j++) {
                    triangle[i][j] = in.nextInt();
                }
            }
            for (int i = rows - 2; i >= 0; --i) {
                for (int j = 0; j < triangle[i].length; j++) {
                    triangle[i][j] = Math.max(triangle[i][j] + triangle[i + 1][j], triangle[i][j] + triangle[i + 1][j + 1]);
                }
            }
            System.out.println(triangle[0][0]);
        }
    }
}
