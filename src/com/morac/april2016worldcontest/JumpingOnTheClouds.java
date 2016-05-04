package com.morac.april2016worldcontest;

import java.util.Scanner;

/**
 * Created by azazel on 29/04/16.
 */
public class JumpingOnTheClouds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num=0,res=1;
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int i=0;
        while(i<n-3){
            if (c[i+2]==0)
                i+=2;
            else
                i++;
            res++;
        }
        System.out.println(res);
    }
}
