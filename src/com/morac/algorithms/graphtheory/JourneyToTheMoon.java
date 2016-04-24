package com.morac.algorithms.graphtheory;


import java.util.Scanner;

/**
 * Created by azazel on 23/04/16.
 */
public class JourneyToTheMoon {

    private static int parent[] = new int[100000];
    private static int rank[] = new int[100000];
    private static int conteo[] = new int[100000];

    private static void makeSet(int x){
        parent[x]=x;
    }

    private static int find(int x){
        if (parent[x]!=x)
            parent[x]=find(parent[x]);
        return parent[x];
    }

    private static void union(int x, int y){
        int xRoot=find(x);
        int yRoot=find(y);
        if (xRoot==yRoot){
            return;
        }
        // x and y are not already in same set. Merge them.
        if (rank[xRoot]< rank[yRoot]){
            parent[xRoot]=yRoot;
        }else if(rank[xRoot]> rank[yRoot]){
            parent[yRoot]=xRoot;
        }else{
            parent[yRoot]=xRoot;
            rank[xRoot]++;
        }
    }

    public static long getCombinations(long n){
        return n*(n-1)/2;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int I = in.nextInt();
        for (int i = 0; i < parent.length; i++) {
            parent[i]=-1;
        }

        for(int i = 0; i < I; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            // Store a and b in an appropriate data structure of your choice
            if (parent[a]==-1){
                makeSet(a);
            }
            if (parent[b]==-1){
                makeSet(b);
            }
            union(a,b);
        }
        for (int i = 0; i < N; i++) {
            if (parent[i]!=-1)
                union(i,find(parent[i]));
            if (parent[i]!=-1)
                conteo[parent[i]]++;
        }
        long combinations = getCombinations(N);
        for (int i = 0; i < N; i++) {
            combinations-=getCombinations(conteo[i]);
        }
        System.out.println(combinations);
    }
}

/*
10 7
0 2
1 8
1 4
2 8
2 6
3 5
6 9
 */
