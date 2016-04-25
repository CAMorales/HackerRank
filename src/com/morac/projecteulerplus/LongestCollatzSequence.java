package com.morac.projecteulerplus;

import java.util.Scanner;

/**
 * Created by azazel on 24/04/16.
 */
public class LongestCollatzSequence {

    private static final int size=5000002;

    private static long terms[] = new long[size];

    private static void initTerms(){
        int count;
        long k;
        for (int i = 1; i < size; i++) {
            count=0;
            k=i;
            while (k>1){
                if (k<i){
                    count+=terms[(int)k];
                    k=1;
                }else{
                    ++count;
                    if (k%2==0){
                        k/=2;
                    }else{
                        k=3*k+1;
                    }
                }
            }
            terms[i]=count;
        }
        long max=1,maxIdx=0;
        for (int i = 1; i < size; i++) {
            if (terms[i]>=max){
                max=terms[i];
                maxIdx=i;
            }
            terms[i]=maxIdx;
        }
    }

    public static void main(String[] args) {
        initTerms();

        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while (t-->0){
            System.out.println(terms[in.nextInt()]);
        }
    }
}
