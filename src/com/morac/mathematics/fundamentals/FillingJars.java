package com.morac.mathematics.fundamentals;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 06/05/2016.
 */
public class FillingJars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n= in.nextInt();
        long m = in.nextInt();
        long a,b,k;
        long total=0;
        while(m-->0){
            a=in.nextLong();
            b=in.nextLong();
            k=in.nextLong();
            total+= (b-a+1) * k;
        }
        total/=n;
        System.out.println(total);
    }
}
