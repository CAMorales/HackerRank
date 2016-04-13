package com.morac.java.introduction;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 13/04/2016.
 */
public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int var=1;
        while(in.hasNext()){
            String line=in.nextLine();
            System.out.println(var +" " + line);
            var++;
        }
    }
}
