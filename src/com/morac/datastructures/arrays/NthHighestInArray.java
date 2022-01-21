package com.morac.datastructures.arrays;

import java.util.*;

public class NthHighestInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nthElement = in.nextInt();
//        withQ(in, n, nthElement);
        withArray(in, n, nthElement);
    }

    private static void withArray(Scanner in, int n, int nthElement) {
        int input;
        int[] q = new int[nthElement];
        q[0] = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            input = in.nextInt();
            for (int j = 0; j < nthElement; j++) {
                if (input > q[j]) {
                    if (j == 0 || q[j - 1] != input) {
                        shiftValues(q, j);
                        q[j] = input;
                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(q));
        System.out.println(q[nthElement - 1]);
    }

    private static void shiftValues(int[] arr, int pos) {
        //This was suggested by Intellij
        if (arr.length - 1 - pos >= 0)
            System.arraycopy(arr, pos, arr, pos + 1, arr.length - 1 - pos);

//Originally was like this.
//        for (int j = arr.length - 1; j > pos; j--) {
//            arr[j] = arr[j - 1];
//        }
    }

    private static void withQ(Scanner in, int n, int thElement) {
        var queue = new LimitedQueue(thElement);
        for (int i = 0; i < n; i++) {
            queue.add(in.nextInt());
        }
        System.out.println(queue.getValue());
        System.out.println(queue);
    }
}


class LimitedQueue {

    private final int maxSize;
    private final SortedSet<Integer> bucket;

    public LimitedQueue(final int maxSize) {
        this.maxSize = maxSize;
        bucket = new TreeSet<>();
    }

    public void add(Integer value) {
        bucket.add(value);
        if (bucket.size() > maxSize) {
            bucket.remove(bucket.first());
        }
    }

    public Integer getValue() {
        return bucket.first();
    }

    @Override
    public String toString() {
        return Arrays.toString(bucket.toArray()) + " " + bucket.last() + " " + bucket.first();
    }
}

//10 4 1 2 3 4 5 6 7 8 9 10

//10 4 10 9 8 7 6 5 4 3 2 1

//10 4 2 3 5 1 9 8 10 7 4 6

//10 4 9 10 9 9 8 8 7 8 9 10
