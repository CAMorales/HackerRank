package com.morac.datastructures.stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Claudio Morales on 15/04/2016.
 */
public class BalancedParentheses {

    private static final Map<Character, Character> map= new HashMap<>();

    public static boolean isBalanced(String parentheses){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < parentheses.length(); i++) {
            switch(parentheses.charAt(i)){
                case '{':
                case '[':
                case '(':
                    stack.push(parentheses.charAt(i));
                    break;
                default:
                    if (stack.isEmpty())
                        return false;
                   if(map.get(stack.pop()) != parentheses.charAt(i))
                       return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        String parentheses;
        while(t-->0){
            parentheses=in.next();
            if (isBalanced(parentheses))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
