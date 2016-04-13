package com.morac.datastructures.trees;

/**
 * Created by Claudio Morales on 13/04/2016.
 */
public class HeightBinaryTree {
    class Node {
        int data;
        Node left;
        Node right;
    }

    int height(Node root){
        int resRight=0;
        int resLeft=0;
        if (root.left!=null){
            resRight++;
            resRight+=height(root.left);
        }
        if (root.right!=null){
            resLeft++;
            resLeft+=height(root.right);
        }
        if (resLeft>resRight)
            return resLeft;
        return resRight;
    }
}
