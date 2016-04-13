package com.morac.java.strings;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 13/04/2016.
 */
public class JavaStringToken {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine().trim();
        String delimiters="[ !,?._'@]+";
        String arr[]=s.split(delimiters);
        if (s.length()==0)
            System.out.println(0);
        else{
            if (s.length()<=400000){
                System.out.println(arr.length);
                for (String str : arr){
                    System.out.println(str);
                }
            }
        }
    }
}
