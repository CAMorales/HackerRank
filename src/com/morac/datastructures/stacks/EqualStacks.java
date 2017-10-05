package com.morac.datastructures.stacks;

import java.util.Scanner;

class MyStack implements Comparable {
    private int[] arr;
    private int idx;
    int val;

    MyStack(int arrSize) {
        this.arr = new int[arrSize];
        val = 0;
        idx = 0;
    }

    void decreaseSum() {
        val -= arr[idx];
        idx++;
    }

    void fillFromStream(Scanner in) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            val += arr[i];
        }
    }

    @Override
    public int compareTo(Object o) {
        return val - ((MyStack) o).val;
    }
}

public class EqualStacks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyStack[] stacks = new MyStack[3];
        for (int i = 0; i < 3; i++) {
            stacks[i] = new MyStack(in.nextInt());
        }

        for (MyStack stack : stacks) {
            stack.fillFromStream(in);
        }
        if (stacks[0].compareTo(stacks[1]) == 0 && stacks[1].compareTo(stacks[2]) == 0) {
            System.out.println(stacks[0].val);
            System.exit(0);
        }
        while (true) {
            if (stacks[0].compareTo(stacks[1]) > 0 || stacks[0].compareTo(stacks[2]) > 0) {
                stacks[0].decreaseSum();
            } else if (stacks[1].compareTo(stacks[0]) > 0 || stacks[1].compareTo(stacks[2]) > 0) {
                stacks[1].decreaseSum();
            } else if (stacks[2].compareTo(stacks[0]) > 0 || stacks[2].compareTo(stacks[1]) > 0) {
                stacks[2].decreaseSum();
            } else {
                break;
            }
        }
        System.out.println(stacks[0].val);
    }
}
