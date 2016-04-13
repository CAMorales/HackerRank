package com.morac.java.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by Claudio Morales on 13/04/2016.
 */
public class PatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        Pattern p=null;
        scan.nextLine();
        while(t-- > 0){
            String line = scan.nextLine();
            try {
                p = Pattern.compile(line);
                System.out.println("Valid");
            }catch (PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
    }
}
