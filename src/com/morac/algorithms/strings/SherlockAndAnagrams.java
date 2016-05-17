package com.morac.algorithms.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Claudio Morales on 11/04/2016.
 */
public class SherlockAndAnagrams {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int count;
        while (t-->0){
            count=0;
            String s = in.next();
            int len = s.length();
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < len; i++) {
                for (int j = i; j < len; j++) {
                    char sub[] = s.substring(i,j+1).toCharArray();
                    Arrays.sort(sub);
                    String s1 = String.valueOf(sub);
                    if (map.containsKey(s1)){
                        map.put(s1,map.get(s1)+1);
                    }else{
                        map.put(s1,1);
                    }
                }
            }
            int val;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (map.get(entry.getKey())>1){
                    val=map.get(entry.getKey());
                    val=val*(val-1)/2;
                    count+=val;
                }
            }
            System.out.println(count);
        }
    }
}
