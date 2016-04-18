package com.morac.ProjectEuler;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 18/04/2016.
 */
public class MultiplesOf3And5 {

    public static void main(String[] args) {
        /*formula to get the sum of all multiples of one number from 1 to n:
            n=n/number
            (number*n*(n+1))/2
        */
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        long num;
        long tres,cinco,quince;
        while(t-->0){
            num=in.nextLong()-1;
            tres=num/3;
            cinco=num/5;
            quince=num/15;
            System.out.println((3*(tres*(tres+1))+5*(cinco*(cinco+1))-15*(quince*(quince+1)))/2);
        }
    }
}
