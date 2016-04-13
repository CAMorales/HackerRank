package com.morac.algorithms.strings;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 11/04/2016.
 */
public class MakeItAnagram {
    public static void main(String[] args) {
        //int countLetters[] = new int[26];
        Scanner in=new Scanner(System.in);
        char[] firstString=in.next().toCharArray();
        char[] secondString=in.next().toCharArray();
        String res;
        int countLetters[] = new int[26];
        int count=0;
        for(int i=0;i<firstString.length;++i){
            countLetters[firstString[i]-'a']++;
        }
        for(int i=0;i<secondString.length;++i){
            countLetters[secondString[i]-'a']--;
        }
        for (int i = 0; i < countLetters.length; i++) {
            count+=Math.abs(countLetters[i]);
        }
        System.out.println(count);
    }
}
