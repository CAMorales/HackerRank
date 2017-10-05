package com.morac.datastructures.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {

    static int[] leftRotation(int[] a, int n, int d) {
        int[] res = new int[n];
        if (n == d) {
            return a;
        }
        for (int i = 0; i < n; i++) {
            res[(i + n - d) % n] = a[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.stream(leftRotation(a, n, d)).mapToObj(i -> i + " ").forEach(System.out::print);
        System.out.println();
        scanner.close();
    }
}
