package com.morac.datastructures.queues;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by Claudio Morales on 15/04/2016.
 */
public class JesseAndCookies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int k= in.nextInt();
        int first,second, sweeter,iterations=0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        if (n<1)
            iterations=-1;
        while(n-- > 0){
            queue.add(in.nextInt());
        }
        while (queue.peek()<k && iterations != -1 && queue.size()>1){
            first=queue.poll();
            second=queue.poll();
            sweeter = first+(second*2);
            queue.add(sweeter);
            iterations++;
        }
        if (queue.peek()<k)
            iterations=-1;
        System.out.println(iterations);
    }
}
