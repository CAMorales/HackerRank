package com.morac.java.bignumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by azazel on 23/04/16.
 */
public class JavaBigDecimal {
    public static void main(String[] args) {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }

        //Solution
        Arrays.sort(s, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return new BigDecimal(o1).compareTo(new BigDecimal(o2));
            }
        }));

        //Output
        for (int i=0;i<n;i++){
            System.out.println(s[i]);
        }
    }
}
