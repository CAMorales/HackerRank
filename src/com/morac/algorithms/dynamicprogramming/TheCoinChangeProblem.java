package com.morac.algorithms.dynamicprogramming;

import java.util.Scanner;

/**
 * Created by azazel on 27/04/16.
 */
public class TheCoinChangeProblem {
    public static void main(String[] args) {
        int n,k, total=0;
        int coins[];
        long res[][];
        int flag;
        Scanner in = new Scanner(System.in);
        flag=0;
        k=in.nextInt();
        n=in.nextInt();
        coins=new int[n];
        res=new long[n+1][k+1];
        for (int i = 0; i < n; i++) {
            coins[i]=in.nextInt();
            if (coins[i]>k){
                flag++;
            }
        }
        if (flag==n || k==0){
            System.out.println(0);
            return;
        }
        // if amount=0 then just return empty set to make the change
        for (int i = 0; i <= n; i++) {
            res[i][0]=1;
        }
        // if no coins given, 0 ways to change the amount
        for (int i = 1; i <=k ; i++) {
            res[0][i]=0;
        }

        // now fill rest of the matrix.

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                // check if the coin value is less than the amount needed
                if (coins[i - 1] <= j) {
                    // reduce the amount by coin value and
                    // use the subproblem solution (amount-v[i]) and
                    // add the solution from the top to it
                    res[i][j]=res[i-1][j]+res[i][j-coins[i-1]];
                }else{
                    // just copy the value from the top
                    res[i][j]=res[i-1][j];
                }
            }
        }
        System.out.println(res[n][k]);
    }
}
