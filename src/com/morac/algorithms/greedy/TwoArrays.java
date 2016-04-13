package com.morac.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Claudio Morales on 12/04/2016.
 */
public class TwoArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a[], b[];
        while(t-->0){
            int n = in.nextInt();
            int k = in.nextInt();
            a=new int[n];
            b=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=in.nextInt();
            }
            Arrays.sort(a);
            for (int i = 0; i < n; i++) {
                b[i]=in.nextInt();
            }
            Arrays.sort(b);
            int i=0;
            int j=n-1;
            boolean flag=true;
            while(i<=j){
                if (a[i]+b[j]<k){
                    flag=false;
                    break;
                }
                ++i;
                --j;
            }
            if (flag)
                System.out.println("YES");
            else{
                System.out.println("NO");
            }
        }
    }
}
