package com.morac.algorithms.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankInAString {

    private static final String word = "hackerrank";

    static boolean containsWord(String s) {
        if (s.length() < word.length()) {
            return false;
        }
        int wordIdx = 0;
        for (char c : s.toCharArray()) {
            if (wordIdx < word.length() && c == word.charAt(wordIdx)) {
                wordIdx++;
            }
        }
        return wordIdx == word.length();
    }

    //solución con regex
    public static boolean containsHackerRank(String s) {
        // Check if string contains 'hackerrank' with
        // 0 or more other chars spaced around each char
        Pattern p = Pattern.compile(".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*");
        Matcher m = p.matcher(s);

        return m.matches();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            // your code goes here
//            System.out.println(containsWord(s) ? "YES" : "NO");
            System.out.println(containsHackerRank(s) ? "YES" : "NO");
        }
    }
}
