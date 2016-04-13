package com.morac.java.strings;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 13/04/2016.
 */
public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(A.equals(new StringBuilder(A).reverse().toString())?"Yes":"No");
    }
}
