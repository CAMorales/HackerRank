package com.morac.datastructures.trie;


import java.util.Scanner;

class TrieNode {
    TrieNode[] arr;
    boolean endOfWord;
    int size = 0;

    // Initialize your data structure here.
    public TrieNode() {
        this.arr = new TrieNode[26];
    }

}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode p = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (p.arr[index] == null) {
                p.arr[index] = new TrieNode();
            }
            p = p.arr[index];
            p.size++;
        }
        p.endOfWord = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode p = searchNode(word);
        return p != null && p.endOfWord;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode p = searchNode(prefix);
        return p != null;
    }

    public int hitsStartsWith(String prefix) {
        TrieNode p = searchNode(prefix);
        return p != null ? p.size : 0;
    }

    public TrieNode searchNode(String s) {
        TrieNode p = root;

        for (char c : s.toCharArray()) {
            int index = c - 'a';
            if (p.arr[index] != null) {
                p = p.arr[index];
            } else {
                return null;
            }
        }
        if (p == root) {
            return null;
        }
        return p;
    }
}

public class Contacts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String instruction, word;
        Trie trie = new Trie();
        for (int i = 0; i < n; i++) {
            instruction = scanner.next();
            word = scanner.next();
            if ("add".equals(instruction)) {
                trie.insert(word);
            } else {
                System.out.println(trie.hitsStartsWith(word));
            }
        }

    }
}
