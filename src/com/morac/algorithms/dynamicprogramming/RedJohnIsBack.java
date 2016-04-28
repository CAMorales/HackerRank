package com.morac.algorithms.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Claudio Morales on 28/04/2016.
 */
public class RedJohnIsBack {

    private static List<Integer> primos = new ArrayList<>(78500);

    private static void generatePrimes(int n){
        boolean marcados[]=new boolean[n+1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!marcados[i]){
                for (int j = i*2; j <= n; j+=i) {
                    marcados[j]=true;
                }
            }
        }
        for (int i = 2; i < marcados.length; i++) {
            if (!marcados[i]){
                primos.add(i);
            }
        }
    }
    private static long getNumberOfWays(int coins[],int k){
        int n=coins.length;
        long res[][]= new long[n+1][k+1];
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
                if (coins[i - 1] <= j) {
                    res[i][j]=res[i-1][j]+res[i][j-coins[i-1]];
                }else{
                    res[i][j]=res[i-1][j];
                }
            }
        }
        return res[n][k];
    }
    public static void main(String[] args) {
        generatePrimes(101);
        int coins[]={1,4};
        int k, res;
        long number;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            k=in.nextInt();
            number=getNumberOfWays(coins,k );
            res=0;
            while(primos.get(res)<=number){
                res++;
            }
            System.out.println(res);
        }
    }
}
