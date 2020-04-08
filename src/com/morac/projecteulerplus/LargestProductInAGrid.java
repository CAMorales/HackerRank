package com.morac.projecteulerplus;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 20/04/2016.
 */
public class LargestProductInAGrid {
    public static void main(String[] args) {
        int n = 20;
        int qtyOfNum = 4;
        long[][] mat = new long[n][n];
        long temp;
        long bigProduct = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        int i, j, k;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (j <= n - qtyOfNum) {
                    temp = mat[i][j];
                    for (k = 1; k < qtyOfNum; k++) {
                        temp *= mat[i][j + k];
                    }
                    bigProduct = Math.max(temp, bigProduct);
                }

                if (i <= n - qtyOfNum) {
                    temp = mat[i][j];
                    for (k = 1; k < qtyOfNum; k++) {
                        temp *= mat[i + k][j];
                    }
                    bigProduct = Math.max(temp, bigProduct);
                }

                if (j >= qtyOfNum && i <= n - qtyOfNum) {
                    temp = mat[i][j];
                    for (k = 1; k < qtyOfNum; k++) {
                        temp *= mat[i + k][j - k];
                    }
                    bigProduct = Math.max(temp, bigProduct);
                }
                if (j <= n - qtyOfNum && i <= n - qtyOfNum) {
                    temp = mat[i][j];
                    for (k = 1; k < qtyOfNum; k++) {
                        temp *= mat[i + k][j + k];
                    }
                    bigProduct = Math.max(temp, bigProduct);
                }
            }
        }
        System.out.println(bigProduct);
    }
}
