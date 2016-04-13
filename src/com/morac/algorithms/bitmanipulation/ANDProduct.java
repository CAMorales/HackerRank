package com.morac.algorithms.bitmanipulation;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 12/04/2016.
 */
public class ANDProduct {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a,b, res;
        while ( t-- > 0){
            a=in.nextInt();
            b=in.nextInt();
            res=a;
            for (int i = a+1; i <= b; i++) {
                res&=i;
            }
            System.out.println(res);
        }
    }
}
