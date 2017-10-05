package com.morac.datastructures.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> words = new HashMap<>(n);
        String word;
        for (int i = 0; i < n; i++) {
            word = scanner.next();
            words.merge(word, 1, Integer::sum);
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println(words.getOrDefault(scanner.next(),0));
        }
    }
}
