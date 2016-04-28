package com.morac.algorithms.dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by azazel on 27/04/16.
 */
public class Knapsack {
    public static void main(String[] args) {
        int n,k,arr[], res[];
        int flag;
        boolean sameValue;
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while (t-->0){
            flag=0;
            sameValue=false;
            n=in.nextInt();
            k=in.nextInt();
            arr=new int[n];
            res=new int[k+1];
            for (int i = 0; i < n; i++) {
                arr[i]=in.nextInt();
                if (arr[i]>k){
                    flag++;
                }else if (arr[i]==k){
                    sameValue=true;
                }
            }
            if (flag==n || k==0){
                System.out.println(0);
                continue;
            }
            if (sameValue){
                System.out.println(k);
                continue;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k+1; j++) {
                    if (j>=arr[i]){//revisamos que sea un indice válido
                        //en la matriz de resultados que está dada por el indice del valor de "la moneda"
                        //se le asigna el mayor de dos valores:
                        //el actual o la suma del valor del array[i] +
                        res[j]=Math.max(res[j],res[j-arr[i]]+arr[i]);
                    }
                }
            }
            System.out.println(res[k]);
        }
    }
}
