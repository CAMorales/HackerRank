package com.morac.algorithms.gametheory;

import java.util.Scanner;

/**
 * Created by azazel on 17/04/16.
 */
public class PermutationGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n, game[];
        String winner;
        while(t-->0){
            n=in.nextInt();
            if (n==2)
                winner="Alice";
            else {
                game=new int[n];
                for (int i = 0; i < n; i++) {
                    game[i]=in.nextInt();
                }
                winner="";
            }
            System.out.println(winner);
        }
    }
}
