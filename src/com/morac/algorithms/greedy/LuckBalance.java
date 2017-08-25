package com.morac.algorithms.greedy;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class LuckBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int k = scanner.nextInt();
        int totalLuck = 0;
        int luck, ci;
        Queue<Integer> importants = new PriorityQueue<>();
        for (int i = 0; i < l; i++) {
            luck = scanner.nextInt();
            totalLuck += luck;
            ci = scanner.nextInt();
            if(ci == 1){
                importants.add(luck);
            }
        }
        while (importants.size()>k){
            totalLuck -= 2*importants.poll();
        }
        System.out.println(totalLuck);
    }
}
