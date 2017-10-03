package com.morac.algorithms.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BeautifulBinaryString {

    static int minSteps(int n, String B){
        Pattern p = Pattern.compile("010");
        Matcher m = p.matcher(B);
        int cou = 0;
        while (m.find()){
            cou++;
        }
        return cou;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}
