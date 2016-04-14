package com.morac.datastructures.trees;

/**
 * Created by Claudio Morales on 14/04/2016.
 */
public class HuffmanDecoding {
    class Node {
        int frequency;
        char data;
        Node left, right;
    }
    void decode(String S ,Node root){
        char direction;
//        StringBuilder sb= new StringBuilder();
        Node temp = root;
        for (int i = 0; i < S.length(); i++) {
            direction=S.charAt(i);
            if (direction=='0')
                temp=temp.left;
            else
                temp=temp.right;
            if (temp.data!='\0'){
                System.out.print(temp.data);
//                sb.append(temp.data);
                temp=root;
            }
        }
//        System.out.println(sb.toString());
    }
}
