package com.morac.datastructures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Claudio Morales on 14/04/2016.
 */
public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int query;
        Stack<ValueMax> stack= new Stack<>();
        int maxValue=Integer.MIN_VALUE;
        while(n-->0){
            query=sc.nextInt();
            switch (query){
                case 1:
                    query=sc.nextInt();
                    maxValue=Math.max(query,maxValue);
                    stack.push(new ValueMax(query,maxValue));
                    break;
                case 2:
                    if (!stack.isEmpty())
                        stack.pop();
                    if (stack.isEmpty())
                        maxValue=Integer.MIN_VALUE;
                    else
                        maxValue=stack.peek().max;
                    break;
                default:
                    if (!stack.isEmpty())
                        System.out.println(stack.peek().max);
            }
        }
    }

    static class ValueMax{
        int cur,max;

        public ValueMax(int cur, int max) {
            this.cur = cur;
            this.max = max;
        }
    }
}
