package com.morac.algorithms.implementation;

import java.math.BigInteger;
import java.util.BitSet;
import java.util.Scanner;

/**
 * Created by azazel on 1/05/16.
 */
public class ACMICPCTeam {
    private static int getMax(String a, String b) {
        int total = 0;
        for (int i = 0; i < a.length(); i++) {
            total += ((a.charAt(i) - '0') | (b.charAt(i) - '0'));
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        String vector[] = new String[N];
        BigInteger b;
        int maxM = 0;
        int maxN = 0;
        in.nextLine();
        for (int i = 0; i < N; i++) {
            vector[i] = in.next();
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N ; j++) {
                int tmp = getMax(vector[i], vector[j]);
                if (tmp > maxN) {
                    maxN = tmp;
                    maxM = 1;
                } else if (maxN == tmp) {
                    maxM++;
                }
            }
        }
        System.out.println(maxN);
        System.out.println(maxM);
    }
}
