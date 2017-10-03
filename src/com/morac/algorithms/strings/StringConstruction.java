package com.morac.algorithms.strings;

import java.util.Scanner;

public class StringConstruction {



    static int stringConstruction(String s) {
        boolean[] letters = new boolean[26];
        // Complete this function
        for (char c : s.toCharArray()) {
            letters[c - 'a'] = true;
        }
        int count = 0;
        for (boolean letter : letters) {
            if (letter) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        in.close();
    }
}
