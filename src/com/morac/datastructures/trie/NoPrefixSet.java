package com.morac.datastructures.trie;


import java.util.Scanner;

class TrieNode2 {
    TrieNode2[] arr;
    boolean endOfWord;

    // Initialize your data structure here.
    public TrieNode2() {
        this.arr = new TrieNode2[10];
    }

}

class Trie2 {
    private TrieNode2 root;

    public Trie2() {
        root = new TrieNode2();
    }

    // Inserts a word into the trie.
    public boolean insert(String word) {
        TrieNode2 p = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (p.arr[index] == null) {
                p.arr[index] = new TrieNode2();
            }
            p = p.arr[index];
            if(p.endOfWord){
                return false;
            }
        }
        p.endOfWord = true;
        return p.endOfWord;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode2 p = searchNode(word);
        return p != null && p.endOfWord;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode2 p = searchNode(prefix);
        return p != null;
    }

    public TrieNode2 searchNode(String s) {
        TrieNode2 p = root;

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

public class NoPrefixSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String word = "";
        Trie2 trie2 = new Trie2();
        boolean goodSet = true;
        for (int i = 0; i < n; i++) {
            word = scanner.next();
            goodSet = !trie2.startsWith(word) && trie2.insert(word);
            if(!goodSet){
                break;
            }
        }
        if (goodSet) {
            System.out.println("GOOD SET");
        }else {
            System.out.println("BAD SET");
            System.out.println(word);
        }
    }
}

