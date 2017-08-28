package com.morac.java.datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class JavaDequeue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            //agregamos la entrada al dequeue
            deque.add(input);
            //la agregamos también al set que se encarga de mantener valores únicos
            set.add(input);

            //si el tamaño del dequeue es igual a m, entonces, ya tenemos un sub-array
            if (deque.size() == m) {
                //si el tamaño del set (valores únicos) es mayor a max, se lo asignamos a max
                if (set.size() > max){
                    max = set.size();
                }
                //removemos el primer elemento del dequeue
                int first = deque.remove();
                //si al remover el elemento del dequeue ya no existe en este, entonces  también se elimina
                // del set como valor único.
                if (!deque.contains(first)){
                    set.remove(first);
                }
            }
        }

        System.out.println(max);
    }
}
