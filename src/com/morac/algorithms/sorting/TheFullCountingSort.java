package com.morac.algorithms.sorting;

import java.util.Scanner;

//class Cadena implements Comparable{
//    public final int n;
//    public final String string;
//
//    public Cadena(int n, String string) {
//        this.n = n;
//        this.string = string;
//    }
//
//    @Override
//    public int compareTo(Object o) {
//        return this.n - ((Cadena)o).n;
//    }
//
//    @Override
//    public String toString() {
//        return string;
//    }
//}

public class TheFullCountingSort {

//    public static void insertionSort(Cadena[] input){
//
//        Cadena temp;
//        for (int i = 1; i < input.length; i++) {
//            for(int j = i ; j > 0 ; j--){
//                if(input[j].compareTo(input[j-1]) < 0){
//                    temp = input[j];
//                    input[j] = input[j-1];
//                    input[j-1] = temp;
//                }
//            }
//        }
//    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        Cadena[] cadenas = new Cadena[n];
//        for (int i = 0; i < n/2; i++) {
//            cadenas[i] = new Cadena(in.nextInt(), "-");
//            in.next();
//        }
//        for (int i = n/2; i < n; i++) {
//            cadenas[i] = new Cadena(in.nextInt(), in.next());
//        }
//        insertionSort(cadenas);
//        StringBuilder stringBuilder = new StringBuilder();
//        for (Cadena cadena : cadenas) {
//            stringBuilder.append(cadena).append(" ");
//        }
//        System.out.println(stringBuilder.toString());
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k;
        StringBuilder[] builders = new StringBuilder[100];
        for (int i = 0; i < 100; i++) {
            builders[i] = new StringBuilder();
        }
        for (int i = 0; i < n; i++) {
            k = in.nextInt();
            String s = in.next();
            if(i < n / 2){
                builders[k].append("- ");
            }
            else{
                builders[k].append(s).append(" ");
            }
        }
        for (StringBuilder builder : builders) {
            System.out.print(builder);
        }
    }
}
