package com.morac.projecteulerplus;

import java.util.*;

/**
 * Created by Claudio Morales on 21/04/2016.
 */
public class HighlyDivisibleTriangularNumber {
    private static SortedMap<Integer, Integer> triangleNumbers = new TreeMap<>();
    private static List<Integer> primos = new ArrayList<>(78500);

    private static void generatePrimes(int n){
        boolean marcados[]=new boolean[n+1];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!marcados[i]){
                for (int j = i*2; j <= n; j+=i) {
                    marcados[j]=true;
                }
            }
        }
        for (int i = 2; i < marcados.length; i++) {
            if (!marcados[i]){
                primos.add(i);
            }
        }
    }

    private static int countFactors(int number){
        int temp=number;
        int factors=1, power;
        for (int i = 0; primos.get(i)*primos.get(i)<=number; i++) {
            power=0;
            while(temp%primos.get(i)==0){
                temp /= primos.get(i);
                ++power;
            }
            factors*=power+1;
        }
        if (temp>1)
            factors*=2;
        return factors;
    }

    private static void generateTriangleNumbers(){
        int number, divisors;
        triangleNumbers.put(1,1);

        for (int i = 2; i <= 41040; i++) {
            number=(i*(i+1))/2;
            divisors=countFactors(number);

            triangleNumbers.put(number,divisors);
        }
    }

    public static void main(String[] args) {
        generatePrimes(41040);
        generateTriangleNumbers();
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int n;
        while (t-->0){
            n=in.nextInt();
            for (Map.Entry<Integer, Integer> entry : triangleNumbers.entrySet()) {
                if (entry.getValue()>n){
                    System.out.println(entry.getKey());
                    break;
                }
            }
        }
    }
}
