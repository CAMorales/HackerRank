package com.morac.projecteulerplus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by azazel on 25/04/16.
 */
public class NonAbundantSums {

    private static List<Integer> primos = new ArrayList<>(3070);

    private static void generatePrimes(int n) {
        boolean[] marcados = new boolean[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!marcados[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    marcados[j] = true;
                }
            }
        }
        for (int i = 2; i < marcados.length; i++) {
            if (!marcados[i]) {
                primos.add(i);
            }
        }
    }

    public static void main(String[] args) {
        generatePrimes(28124);
        int n;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            if (n < 24 || primos.contains(n)) {
                System.out.println("No");
            } else {

            }
        }

    }
}
