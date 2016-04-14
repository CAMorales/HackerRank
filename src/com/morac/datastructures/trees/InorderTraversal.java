package com.morac.datastructures.trees;

/**
 * Created by Claudio Morales on 14/04/2016.
 */
public class InorderTraversal {
    void Inorder(Node root) {
        if (root.left!=null) {
            Inorder(root.left);
        }
        System.out.print(root.data + " ");
        if (root.right!=null) {
            Inorder(root.right);
        }

    }
}
