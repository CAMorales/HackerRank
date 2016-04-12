package graphtheory;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by azazel on 11/04/16.
 */
class Graph{
    private int vertices;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists
    private LinkedList<Integer> orig[]; //Adjacency Lists
    private int padres[], niveles[];

    // Constructor
    Graph(int v){
        vertices = v;
        orig = new LinkedList[vertices+1];
        padres = new int[vertices+1];
        niveles = new int[vertices+1];
        for (int i=1; i<=vertices; ++i){
            orig[i] = new LinkedList();
            for(int j = 1; j<7;++j){
                if((i+j)<=vertices)
                    orig[i].push(i+j);
            }
        }
    }

    void printList(){
        for (int i = 1; i<=vertices;++i){
            System.out.print(i);
            for (Integer vertex :
                    adj[i]) {
                System.out.print( " -> "+ vertex);
            }
            System.out.println();
        }
    }

    void replace(int old, int newVert){
        int i=old-6;
        if(i<1)
            i=1;
        while(i<old){
            adj[i].set(adj[i].indexOf(old),newVert);
            ++i;
        }
    }

    void cloneList(){
        adj=orig.clone();

        for (int i=1; i<=vertices; ++i){
            adj[i]=(LinkedList<Integer>) orig[i].clone();
            niveles[i]=-1;
        }
    }

    int getRequiredMoves(){
        return niveles[vertices];
    }

    void bfs(){
        int nivel=0;
        int padre;
        boolean flag=true;
        niveles[1]=nivel; //iniciamos en la casilla 1
        while(flag){
            flag=false;
            for (int i=1;i<=vertices;++i){
                if (niveles[i]==nivel){
                    flag=true;
                    padre=i;
                    for (Integer vert : adj[i]) {
                        if (niveles[vert]==-1){
                            niveles[vert]=nivel+1;
                            padres[vert]=padre;
                        }
                    }
                }
            }
            ++nivel;
        }
    }
}

public class SnakesAndLadders {

    public static void main(String[] args) {
        int vertices=100;
        Graph graph = new Graph(vertices);

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int res[]= new int[t];
        int oldV=0,newV=0,ladders,snakes;
        for(int a0 = 0; a0 < t; a0++){
            graph.cloneList();
            ladders=in.nextInt();

            for(int i=0;i<ladders;++i){
                oldV=in.nextInt();
                newV=in.nextInt();
                graph.replace(oldV,newV);
            }
            snakes=in.nextInt();
            for(int i=0;i<snakes;++i){
                oldV=in.nextInt();
                newV=in.nextInt();
                graph.replace(oldV,newV);
            }
            //graph.printList();
            graph.bfs();
            System.out.println(graph.getRequiredMoves());
        }
    }
}
