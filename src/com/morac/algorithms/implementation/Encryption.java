package com.morac.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 03/05/2016.
 */
public class Encryption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int row=(int)Math.round(Math.sqrt(s.length()));
        int column;
        if (row>=Math.sqrt(s.length())){
            column=row;
        }else{
            column=row+1;
        }
        for (int i = 0; i < column; i++) {
            for (int j = i; j <s.length(); j+=column) {
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
        }
    }
}
