package com.morac.algorithms.dynamicprogramming;

import java.util.Scanner;

/**
 * Created by azazel on 17/04/16.
 */
public class StringReduction {

    static int stringReduction(String a) {
        char abc[]= new char[3];
        for (int i = 0; i < a.length(); i++) {
            abc[a.charAt(i)-'a']++;
        }
        if (abc[0]==a.length() || abc[1]==a.length() ||abc[2]==a.length())
            return a.length();
        else if ((abc[0]%2==0 && abc[1]%2==0 && abc[2]%2==0)||(abc[0]%2!=0 && abc[1]%2!=0 && abc[2]%2!=0))
            return 2;
        return 1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String line;
        while(t-->0){
            line=in.next();
            System.out.println(stringReduction(line));
        }
    }
}
