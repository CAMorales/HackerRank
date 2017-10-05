package com.morac.datastructures.queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueUsingTwoStacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> queue= new ArrayDeque<>(1000);
        int q;
        for (int i = 0; i < n; i++) {
            q = scanner.nextInt();
            switch (q) {
                case 1:
                    queue.add(scanner.nextInt());
                    break;
                case 2:
                    queue.remove();
                    break;
                case 3:
                    System.out.println(queue.peek());
            }
        }
    }
}
