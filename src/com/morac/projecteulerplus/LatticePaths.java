package com.morac.projecteulerplus;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by azazel on 24/04/16.
 */
public class LatticePaths {
    //Method 1 slower, using Dynamic programming (Pascal's triangle)
    /*private static BigInteger grid[][];

    private static void initGrid(int n, int m){
        grid=new BigInteger[n+1][m+1];
        for (int i = 0; i < n+1; i++) {
            grid[i][0]=BigInteger.valueOf(1);
        }
        for (int j = 0; j < m + 1; j++) {
            grid[0][j]=BigInteger.valueOf(1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while (t-->0){
            int n = in.nextInt();
            int m = in.nextInt();
            initGrid(n,m);
            for (int i = 1; i < n+1; i++) {
                for (int j = 1; j < m+1; j++) {
                    grid[i][j]=grid[i-1][j].add(grid[i][j-1]);
                }
            }
            System.out.println(grid[n][m].mod(BigInteger.valueOf(1000000007)));
        }
    }*/

    //method 2 faster, using factorial formula:
    // (n+m)!/n!*m!
    private static BigInteger factorials[]= new BigInteger[1001];

    private static BigInteger factorial(int num){
        if (num==1)
            return new BigInteger("1");
        if (factorials[num] != null)
            return factorials[num];
        return factorials[num]=BigInteger.valueOf(num).multiply(factorial(num-1));
    }

    public static void main(String[] args) {
        factorials[0]= new BigInteger("1");
        factorials[1]=new BigInteger("1");
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while (t-->0){
            int n = in.nextInt();
            int m = in.nextInt();
            System.out.println(
                    factorial(n+m).divide(
                            factorial(n).multiply(factorial(m)))
                            .mod(BigInteger.valueOf(1000000007))
            );
        }
    }
}


/*
1
500 500
159835829
 */