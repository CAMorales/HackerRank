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


    public static void main(String[] args) {
        generatePrimes(103);
        int coins[]={1,4};
        int change, res;
        long number;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            change=in.nextInt();
            number=TheCoinChangeProblem.getDiffWaysToMakeChangeFromCoins(coins, change);
            res=0;
            while(primos.get(res)<=number){
                res++;
            }
            System.out.println(res);
        }
    }
}
