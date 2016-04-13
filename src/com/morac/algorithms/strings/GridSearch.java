package com.morac.gridsearch;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Claudio Morales on 7/04/16.
 */
public class GridSearch {

    public static void occurrences(String original, String searched, HashMap<Integer, Integer> mapa){
        int lastIndex=0;
        while (lastIndex!=-1){
            lastIndex=original.indexOf(searched,lastIndex);
            if (lastIndex!=-1){
                if (mapa.containsKey(lastIndex))
                    mapa.put(lastIndex,mapa.get(lastIndex)+1);
                else
                    mapa.put(lastIndex,1);
//                lastIndex+=searched.length();
                ++lastIndex;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            int R1=0,r1=0,firstFind=-1;
            HashMap<Integer,Integer> mapa= new HashMap<>();
            while(R1<R && r1<r){
                if (G[R1].contains(P[r1])){
                    occurrences(G[R1],P[r1],mapa);
                    if(firstFind<0)
                        firstFind=R1;
                    ++r1;
                }else{
                    mapa= new HashMap<>();
                    r1=0;
                    if (firstFind>-1)
                        R1=firstFind;
                    firstFind=-1;
                }
                ++R1;
            }

            if(mapa.containsValue(r)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
/*

1
5 15
111111111111111
111111111111111
111111011111111
111111111111111
111111111111111
3 5
11111
11111
11110

1
4 6
123412
561212
123634
781288
2 2
12
34


2
10 10
7283455864
6731158619
8988242643
3830589324
2229505813
5633845374
6473530293
7053106601
0834282956
4607924137
3 4
9505
3845
3530
15 15
400453592126560
114213133098692
474386082879648
522356951189169
887109450487496
252802633388782
502771484966748
075975207693780
511799789562806
404007454272504
549043809916080
962410809534811
445893523733475
768705303214174
650629270887160
2 2
99
99
*/
