package com.morac.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Claudio Morales on 15/04/2016.
 */
public class LargestRectangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        int heights[]= new int[t];
        for (int i = 0; i < t; i++) {
            heights[i]=in.nextInt();
        }
    }
}
