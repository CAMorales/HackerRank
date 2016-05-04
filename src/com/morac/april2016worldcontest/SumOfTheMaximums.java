package com.morac.april2016worldcontest;

import java.util.Scanner;

/**
 * Created by azazel on 30/04/16.
 */

/*
 * Input Format

The first line contains 2 space-separated positive integers, n (the length of array A) and m (number of queries), respectively.
The second line contains n space-separated integers, a0,a1,…,an−1a0,a1,…,an−1 describing each element aj (where 0≤j<n0≤j<n) in array A.
Each of the m subsequent lines contains 2 space-separated positive integers describing the respective values for Li and Ri in query i (where 0≤i<m0≤i<m).

Constraints

    1≤ n,m ≤ 1350001 ≤ n,m ≤ 135000
    −10^9 ≤ ai ≤1 0^9
    1 ≤ Li ≤ Ri ≤ n

    Output Format

For each query i (where 0≤i<m0≤i<m), print its answer on a new line.

Sample Input

3 6
1 3 2
1 1
1 2
1 3
2 2
2 3
3 3

Sample Output

1
7
15
3
8
2

Explanation

The answer for the second query is shown below: F(A,1,2)=max1≤x≤1A[x]+max1≤x≤2A[x]+max2≤x≤2A[x]F(A,1,2)=max1≤x≤1A[x]+max1≤x≤2A[x]+max2≤x≤2A[x] =1+3+3=7=1+3+3=7

The answer for the third query is shown below: F(A,1,3)=max1≤x≤1A[x]+max1≤x≤2A[x]+max1≤x≤3A[x]+max2≤x≤2A[x]+max2≤x≤3A[x]+max3≤x≤3A[x]F(A,1,3)=max1≤x≤1A[x]+max1≤x≤2A[x]+max1≤x≤3A[x]+max2≤x≤2A[x]+max2≤x≤3A[x]+max3≤x≤3A[x] =1+3+3+3+3+2=15
 */
public class SumOfTheMaximums {
    public static void main(String[] args) {
        int arrLength, numOfQueries, leftIdx, rightIdx;
        Scanner in = new Scanner(System.in);
        arrLength=in.nextInt();
        numOfQueries=in.nextInt();
        long arr[]= new long[arrLength+1];
//        long mat[][] = new long[arrLength+1][arrLength+1];
        for (int i = 1; i <= arrLength; i++) {
//            mat[i][i]=mat[i][0]=mat[0][i]=in.nextInt();
            arr[i]=in.nextLong();
        }
        long maxValue;
        for (int i = 1; i <= arrLength; i++) {
            maxValue=Integer.MIN_VALUE;
            for (int j = 1; j <= arrLength; j++) {
//                if (j!=i)
//                    mat[i][j]=maxValue=Math.max(Math.max(mat[i][j],maxValue),mat[0][j]);
//                else
//                    maxValue=mat[i][j];
            }
        }
        int sum;
        while (numOfQueries-->0){
            leftIdx=in.nextInt();
            rightIdx=in.nextInt();
            sum=0;
            for (int i = leftIdx; i <= rightIdx; i++) {
                for (int j = i; j <=rightIdx ; j++) {
//                    sum+=mat[i][j];
                }
            }
            System.out.println(sum);
        }
    }
}
