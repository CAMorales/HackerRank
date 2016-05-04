package com.morac.algorithms.implementation;

import java.math.BigInteger;
import java.util.BitSet;
import java.util.Scanner;

/**
 * Created by azazel on 1/05/16.
 */
public class ACMICPCTeam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        BitSet vector[] = new BitSet[N];
        BigInteger b;
        int maxM=0;
        BigInteger maxN = new BigInteger("0");
        BigInteger val;
        for (int i = 0; i < N; i++) {
            b = new BigInteger(in.next());
            vector[i] = BitSet.valueOf(b.toByteArray());
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = i+1; j < N - 1; j++) {
                vector[i].xor(vector[j]);
                val=new BigInteger(vector[i].toByteArray());
                if (val.compareTo(maxN)>0){
                    maxM=1;
                    maxN=val;
                }else if (val.compareTo(maxN)==0){
                    maxM++;
                }
                vector[i].xor(vector[j]);
            }
        }

        System.out.println(maxN);
        System.out.println(maxM);
    }
}
