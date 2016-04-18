package com.morac.datastructures.heap;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by Claudio Morales on 15/04/2016.
 */
public class QHEAP1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int query,element;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        while(n-->0){
            query=in.nextInt();
            if (query==1){
                element=in.nextInt();
                heap.add(element);
            }else if (query==2){
                element=in.nextInt();
                heap.remove(element);
            }else{
                System.out.println(heap.peek());
            }
        }
    }
}
