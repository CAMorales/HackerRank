package com.morac.other;



import java.util.Scanner;

//This transforms from a SpreadSheet-like column to an index
public class IndexFromColumns {

    private static int calculateIndex(String column) {
        char[] chars = column.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length ; i++) {
            char aChar = chars[i];
            result += getIndex(aChar) * Math.pow(26, chars.length - (i + 1));
        }
        return result;
    }

    private static int getIndex(char c) {
        return c - 'A' + 1;
    }

    public static void main(String[] args) {
        //ZZZ = 18278
        //AA = 27
        //AZ = 52
        //BA = 53
        //BZ = 78
        //CA = 79
        //ZZ = 702
        //AAA = 703
        //AAAA = 18279
        Scanner in = new Scanner(System.in);
        String column = in.next();
        System.out.println(calculateIndex(column));
    }
}
