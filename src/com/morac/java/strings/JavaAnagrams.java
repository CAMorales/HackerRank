package com.morac.java.strings;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 13/04/2016.
 */
public class JavaAnagrams {
    static boolean isAnagram(String A, String B) {
        int ret=0;
        A=A.toUpperCase();
        B=B.toUpperCase();
        for (int i = 0; i < A.length(); i++) {
            ret^=A.charAt(i);
        }
        for (int i = 0; i < B.length(); i++) {
            ret^=B.charAt(i);
        }
        if (ret==0)
            return true;
        return false;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(isAnagram(A,B)?"Anagrams":"Not Anagrams");

    }
}
