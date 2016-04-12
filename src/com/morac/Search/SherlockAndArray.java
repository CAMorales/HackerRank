package com.morac.Search;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 12/04/2016.
 */
public class SherlockAndArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n;
        int [] arr;
        while (t-- > 0){
            n = in.nextInt();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=in.nextInt();
            }
            int j=n-1;
            int i=0;
            int sum=0;
            while(i!=j){
                if (sum>=0){
                    sum-=arr[j];
                    j--;
                }else{
                    sum+=arr[i];
                    i++;
                }
            }
            if (sum==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
