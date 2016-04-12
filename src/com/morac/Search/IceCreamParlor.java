package com.morac.Search;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 12/04/2016.
 */
public class IceCreamParlor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int m,n, c[];
        while(t-- > 0){
            m = in.nextInt();
            n = in.nextInt();
            c=new int[n];
            for (int i = 0; i < n; i++) {
                c[i]=in.nextInt();
            }
            int indice=0;
            int indice2=0;
            outer:
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if (m- c[i]==c[j]){
                        indice=i+1;
                        indice2=j+1;
                        break outer;
                    }
                }
            }
            System.out.println(indice +" "+indice2);
        }
    }
}


/*
Input:
4
4
5
1 4 5 3 2
4
4
2 2 4 3
6
11
2 3 5 6 2 4 2 3 4 5 3
6
11
3 5 4 3 2 4 2 6 5 3 2

Expected output:
1 4
1 2
1 6
3 5
*/