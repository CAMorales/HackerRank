package com.morac.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Claudio Morales on 12/04/2016.
 */
public class GridChallenge {

    private static boolean isOrdered(char str[][]){
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length-1; j++) {
                if (str[j][i]>str[j+1][i])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n;
        char str[][];
        boolean flag;
        while(t-- > 0){
            n = in.nextInt();
            str = new char[n][];
            flag=true;
            for (int i = 0; i < n; i++) {
                str[i]=in.next().toCharArray();
                Arrays.sort(str[i]);
                if (i>0){
                    for (int j = 0; j < n; j++) {
                        flag &= str[i][j]>=str[i-1][j];
                    }
                }
            }
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
