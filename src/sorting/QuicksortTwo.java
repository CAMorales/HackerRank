package sorting;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 11/04/2016.
 */
public class QuicksortTwo {
    static void partition(int[] ar, int length) {
        int pivot=ar[0];
        int []left=new int[length];
        int []right=new int[length];
        int i=0,j=0;
        if (length<=1)
            return;
        for (int k = 1; k < length; k++) {
            if (ar[k]<pivot)
                left[i++]=ar[k];
            else
                right[j++]=ar[k];
        }
        int l=0;
        partition(left,i);
        for (int k = 0; k < i; k++) {
            ar[l]=left[k];
            ++l;
        }
        ar[l]=pivot;
        ++l;
        partition(right,j);
        for (int k = 0; k < j; k++) {
            ar[l]=right[k];
            ++l;
        }
        for (int k = 0; k < length; k++) {
            System.out.print(ar[k]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        partition(ar, n);
    }
}
