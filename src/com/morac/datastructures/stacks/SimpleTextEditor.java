package com.morac.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Claudio Morales on 15/04/2016.
 */
public class SimpleTextEditor {

    public static void method1(){
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        int op;
        int k;
        Stack<Integer> stackOps = new Stack<>();
        Stack<String> stackInputkStr = new Stack<>();
        Stack<String> stackDelStr = new Stack<>();
        String inputStr, delStr;
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            op=in.nextInt();
            switch (op){
                case 1:
                    stackOps.push(op);
                    inputStr = in.next();
                    stackInputkStr.push(inputStr);
                    sb.append(inputStr);
                    break;
                case 2:
                    stackOps.push(op);
                    k = in.nextInt();
                    stackDelStr.push(sb.substring(sb.length()-k));
                    sb.delete(sb.length()-k, sb.length());
                    break;
                case 3:
                    k = in.nextInt();
                    System.out.println(sb.charAt(k-1));
                    break;
                default:
                    op=stackOps.pop();
                    if (op==1){
                        inputStr=stackInputkStr.pop();
                        int lastIndex=sb.length()-inputStr.length();
                        sb.delete(lastIndex,lastIndex+inputStr.length());
                    }else{
                        delStr=stackDelStr.pop();
                        sb.append(delStr);
                    }
            }
        }
    }


    public static void main(String[] args) {
        method1();
    }
}
