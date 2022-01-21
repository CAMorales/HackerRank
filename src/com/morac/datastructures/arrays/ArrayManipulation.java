package com.morac.datastructures.arrays;

import java.util.Scanner;

public class ArrayManipulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a, b, k;
        long[] nums = new long[n];
        long maxNum = 0, temp = 0;
        for (int i = 0; i < m; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            k = scanner.nextInt();
            nums[a - 1] += k;
            if (b < n) {
                nums[b] -= k;
            }
        }
        for (long num : nums) {
            temp += num;
            maxNum = Math.max(temp, maxNum);
        }
        System.out.println(maxNum);
    }
}
