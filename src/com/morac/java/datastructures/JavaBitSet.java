package com.morac.java.datastructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int m = scanner.nextInt();
        BitSet[] sets = {new BitSet(size),new BitSet(size)};
        while (m-- > 0){
            String op = scanner.next();
            int set = scanner.nextInt();
            int idx = scanner.nextInt();
            switch (op){
                case "SET":
                    sets[set-1].set(idx);
                    break;
                case "FLIP":
                    sets[set-1].flip(idx);
                    break;
                case "AND":
                    sets[set-1].and(sets[idx-1]);
                    break;
                case "OR":
                    sets[set-1].or(sets[idx-1]);
                    break;
                case "XOR":
                    sets[set-1].xor(sets[idx-1]);
                    break;
            }
            System.out.println(sets[0].cardinality() + " " + sets[1].cardinality());
        }
    }
}
