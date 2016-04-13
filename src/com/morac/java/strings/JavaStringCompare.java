package com.morac.java.strings;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 13/04/2016.
 */
public class JavaStringCompare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int k = sc.nextInt();
        String min, max;
        min=A.substring(0,k);
        max=A.substring(0,k);
        for (int i = 1; i <= A.length() - k; i++) {
            if (A.substring(i,i+k).compareTo(min)<0)
                min=A.substring(i,i+k);
            if (A.substring(i,i+k).compareTo(max)>0)
                max=A.substring(i,i+k);
        }
        System.out.println(min);
        System.out.println(max);
    }
}
