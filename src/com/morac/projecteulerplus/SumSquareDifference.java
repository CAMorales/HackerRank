package com.morac.projecteulerplus;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 19/04/2016.
 */
public class SumSquareDifference {
    public static void main(String[] args) {
        long sum, squareSum, sumOfSquares, n;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextLong();
            sum = (n * (n + 1)) / 2;
            squareSum = sum * sum;
            sumOfSquares = (n * (n + 1) * (2 * n + 1)) / 6;
            System.out.println(squareSum - sumOfSquares);
        }
    }
}
