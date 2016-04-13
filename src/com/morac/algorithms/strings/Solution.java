package com.morac.algorithms.strings;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 08/04/2016.
 */
public class Solution {
    public static void main(String[] args) {
        //int countLetters[] = new int[26];
        Scanner in=new Scanner(System.in);
        char[] inputString=in.next().toCharArray();
        String res;
        int countLetters[] = new int[26];
        int count=0;
        for(int i=0;i<inputString.length;++i){
            if(countLetters[inputString[i]-'a']==0)
                countLetters[inputString[i]-'a']++;
            else
                countLetters[inputString[i]-'a']--;
        }
        for (int i = 0; i < countLetters.length; i++) {
            count+=countLetters[i];
        }
        if (count<2)
            res="YES";
        else
            res="NO";
        System.out.println(res);
    }
}

/*
4
aaab
baa
aaa
hgygsvlfcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcwflvsgygh
*/
