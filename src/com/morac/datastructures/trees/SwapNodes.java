package com.morac.datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Claudio Morales on 14/04/2016.
 */
public class SwapNodes {

    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int value){
            this.data=value;
        }
    }

    private static void printInorder(Node root) {
        if (root.left!=null) {
            printInorder(root.left);
        }
        System.out.print(root.data + " ");
        if (root.right!=null) {
            printInorder(root.right);
        }

    }

    private static Node createNode(int value){
        if (value == -1)
            return null;
        return new Node(value);
    }

    /**
     *
     * @param root the root of the tree
     * @param depth the starting depth
     * @param multiplier depth should be a multiple of this value;
     */
    private static void swapNodes(Node root, int depth, int multiplier){
        if (root!=null){
            if (depth % multiplier==0){
                Node temp = root.right;
                root.right= root.left;
                root.left=temp;
            }
            swapNodes(root.left,depth+1,multiplier);
            swapNodes(root.right,depth+1,multiplier);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNodes=sc.nextInt();
        Node root = new Node(1);
        Node current;
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            current=queue.poll();

            current.left=createNode(sc.nextInt());
            current.right=createNode(sc.nextInt());
            if (current.left!=null)
                queue.add(current.left);
            if (current.right!=null)
                queue.add(current.right);
        }

        int t = sc.nextInt();
        while(t-- > 0){
            int k = sc.nextInt();

            swapNodes(root,1,k);

            printInorder(root);
            System.out.println();
        }
    }
}
