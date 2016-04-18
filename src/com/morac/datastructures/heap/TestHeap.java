package com.morac.datastructures.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by Claudio Morales on 15/04/2016.
 */
public class TestHeap {

    static class PQsort implements Comparator<Integer> {

        private static int compare(int x, int y){
            return (x > y) ? -1 : ((x == y) ? 0 : 1);
        }

        public int compare(Integer one, Integer two) {
            return compare(one.intValue(), two.intValue());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int k= in.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>(new PQsort());
        while(n-- > 0){
            queue.add(in.nextInt());
        }
        System.out.println(queue);
    }
}
