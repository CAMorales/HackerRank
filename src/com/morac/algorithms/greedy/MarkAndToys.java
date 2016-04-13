package com.morac.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Claudio Morales on 13/04/2016.
 */
public class MarkAndToys {
    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt(),k=stdin.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++)
            prices[i]=stdin.nextInt();

        int answer;
        Arrays.sort(prices);
        int sum=0;
        for (answer = 0; answer < n; answer++){
            sum+=prices[answer];
            if (sum>=k)
                break;
        }
        System.out.println(answer);
    }
}
