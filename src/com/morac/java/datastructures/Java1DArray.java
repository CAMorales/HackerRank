package com.morac.java.datastructures;

import java.util.Scanner;

public class Java1DArray {

    static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return isSolvable(leap, game, 0);
    }
    static boolean isSolvable(int leap, int[] game, int idx){
        //si va para atrás se revisa que no vaya fuera del array y que no se haya visitado anteriormente la celda
        if(idx < 0 || game[idx] == 1) return false;
        //si va para adelante se revisa que esté en el final o que lo pueda "saltar"
        if((idx == game.length - 1) || ( idx + leap >= game.length )) return true;
        //se marca la celda como visitada
        game[idx] = 1;

        return isSolvable(leap,game, idx + 1) || //se visita hacia adelante + 1
                isSolvable(leap, game, idx - 1) || // se visita hacia atrás - 1
                isSolvable(leap, game, idx + leap);// se visita hacia adelante con el salto
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
