package com.morac.projecteulerplus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Claudio Morales on 20/04/2016.
 */
public class SummationOfPrimes {
    private static List<Integer> primos = new ArrayList<>(78500);

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
        generatePrimes(1000000);
        int n;
        long res;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            res = 0;
            for (Integer num : primos) {
                if (num > n) {
                    break;
                }
                res += num;
            }
            System.out.println(res);
        }
    }
}
