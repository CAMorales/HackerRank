package sorting;

import java.util.Scanner;

/**
 * Created by Claudio Morales on 11/04/2016.
 */
public class InsertionSortPartOne {
    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        int i = ar.length-1;
        int value = ar[i];
        --i;
        while(i>=0 && ar[i]>value){
            ar[i+1]=ar[i];
            printArray(ar);
            --i;
        }
        ar[i+1]=value;
        printArray(ar);
    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
