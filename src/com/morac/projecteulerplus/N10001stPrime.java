package com.morac.projecteulerplus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Claudio Morales on 19/04/2016.
 */
public class N10001stPrime {
    private static List<Integer> primos = new ArrayList<>(10000);

    private static void generatePrimes() {
        //primos == sieve of Erathotenes (criba de eratóstenes)
        //For performance purposes false == prime number, true == composite number (numero compuesto)
        int n = 104800;
        boolean[] erathotenesSieve = new boolean[n + 1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!erathotenesSieve[i]) { //If false it means the number is prime
                //we mark all multiples of i as composite
                for (int j = i * 2; j <= n; j += i) {
                    erathotenesSieve[j] = true; // marked as composite number
                }
            }
        }
        for (int i = 2; i < erathotenesSieve.length; i++) {
            if (!erathotenesSieve[i]) { //If false it means the number is prime
                primos.add(i);
            }
        }
        /*for (Integer primo : primos) {
            System.out.println(primo);
        }
        System.out.println(primos.size());*/
    }

    public static void main(String[] args) {
        generatePrimes();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int n;
        while (t-- > 0) {
            n = in.nextInt();
            System.out.println(primos.get(n - 1));
        }

    }
}
