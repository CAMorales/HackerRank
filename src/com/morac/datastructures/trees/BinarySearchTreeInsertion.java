package com.morac.datastructures.trees;

/**
 * Created by Claudio Morales on 14/04/2016.
 */
public class BinarySearchTreeInsertion {
    static Node Insert(Node root,int value){
        if (root==null){
            root = new Node();
            root.data=value;
            root.left=null;
            root.right=null;
        }else{
            if (value<root.data)
                root.left=Insert(root.left, value);
            else
                root.right=Insert(root.right, value);
        }

        return root;
    }
}
