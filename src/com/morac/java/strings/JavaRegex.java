package com.morac.java.strings;

import java.util.Scanner;

/**
 * Created by azazel on 25/04/16.
 */
public class JavaRegex {

    static class myRegex {
        private String digit="(\\d{1,2}|[0-1]\\d\\d|2[0-4]\\d|25[0-5])";
        public String pattern=digit+"."+digit+"."+digit+"."+digit;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));

        }
    }
}
