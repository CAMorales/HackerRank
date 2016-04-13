package com.morac.datastructures.trees;


/**
 * Created by Claudio Morales on 13/04/2016.
 */
public class PreorderTraversal {
    class Node {
        int data;
        Node left;
        Node right;
    }

    void Preorder(Node root) {
        System.out.print(root.data + " ");
        if (root.left!=null)
            Preorder(root.left);
        if (root.right!=null)
            Preorder(root.right);
    }

}
