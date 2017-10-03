package com.morac.algorithms.strings;

import java.util.Scanner;

public class SuperReducedString {

    static String superReducedString(String s) {
        // Complete this function
        StringBuilder reducedString = new StringBuilder(s);
        for (int i = 1; i < reducedString.length(); i++) {
            if (reducedString.charAt(i) == reducedString.charAt(i - 1)) {
                reducedString.delete(i - 1, i + 1);
                i = 0;
            }
        }

        return reducedString.length() > 0 ? reducedString.toString() : "Empty String";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = superReducedString(s);
        System.out.println(result);
    }
}
