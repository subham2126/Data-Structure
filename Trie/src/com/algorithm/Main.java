package com.algorithm;

public class Main {

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertData("subham");
        trie.insertData("subha");
        System.out.println(trie.isThere("subham"));

        System.out.println(trie.isThere("subhama"));

        System.out.println(trie.prefixMatchCount("subha"));
        System.out.println(trie.prefixMatchCount("subham"));
        System.out.println(trie.prefixMatchCount("subhama"));
    }
}
