package com.morac.java.strings;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 13/04/2016.
 */
public class JavaStringsIntroduction {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if (A.compareTo(B)>0)
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+ " "+
                B.substring(0,1).toUpperCase()+B.substring(1));
    }
}
