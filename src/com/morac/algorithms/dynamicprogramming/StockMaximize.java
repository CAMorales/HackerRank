package com.morac.algorithms.dynamicprogramming;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 28/04/2016.
 */
public class StockMaximize {
    private static long calcProfit(int prices[]){
        long profit=0;
        long maxSofar=0;
        for (int i = prices.length-1; i >=0 ; i--) {
            if (prices[i]>maxSofar){
                maxSofar=prices[i];
            }
            profit+=maxSofar-prices[i];
        }
        return profit;
    }

    public static void main(String[] args) {
        int n, prices[];
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0){
            n=in.nextInt();
            prices=new int[n];
            for (int i = 0; i < n; i++) {
                prices[i]=in.nextInt();
            }
            System.out.println(calcProfit(prices));
        }
    }
}
