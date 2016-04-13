package com.morac.algorithms.strings;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 11/04/2016.
 */
public class BearAndSteadyGene {

    private static String string;
    private static int countLetters[];
    private static int n;

    private static boolean isSteady(){
        int cuarto=n/4;
        if (countLetters['A'-'A']<=cuarto && countLetters['G'-'A']<=cuarto &&
                countLetters['C'-'A']<=cuarto && countLetters['T'-'A']<=cuarto){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        countLetters = new int[26];
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int res;
        string = in.next();
        for (int i = 0; i < string.length(); i++) {
            countLetters[string.charAt(i)-'A']++;
        }
        if (isSteady()){
            res=0;
        }else{
            res=Integer.MAX_VALUE;
            int j=0;
            for (int i = 0; i < string.length(); i++) {
                countLetters[string.charAt(i)-'A']--;
                while(isSteady() && j<=i){
                    res = i-j+1 < res ? i-j+1 : res;
                    countLetters[string.charAt(j)-'A']++;
                    ++j;
                }
            }
        }
        System.out.println(res);
    }
}
