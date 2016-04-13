package com.morac.datastructures.trees;

/**
 * Created by Claudio Morales on 13/04/2016.
 */
public class PostorderTraversal {
    class Node {
        int data;
        Node left;
        Node right;
    }

    void Postorder(Node root) {
        if (root.left!=null) {
            Postorder(root.left);
        }
        if (root.right!=null) {
            Postorder(root.right);
        }
        System.out.print(root.data + " ");
    }
}
