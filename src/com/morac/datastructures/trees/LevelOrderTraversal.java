package com.morac.datastructures.trees;

/**
 * Created by Claudio Morales on 14/04/2016.
 */
public class LevelOrderTraversal {
    void LevelOrder(Node root){
        java.util.LinkedList<Node> list = new java.util.LinkedList<Node>();
        if (root != null)
            list.add(root);
        while (list.peekFirst() != null) {
            Node current = list.poll();
            System.out.print(current.data + " ");
            if (current.left != null)
                list.add(current.left);
            if (current.right != null)
                list.add(current.right);
        }
    }
}
