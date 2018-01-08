package com.algorithm;

public class Trie {

    Node head;

    static class Node {

        int value;
        boolean isExact;
        Node next[] = new Node[26];

        Node() {
            this.value = 0;
            this.isExact = false;
            for (int i = 0; i < 26; i++)
                next[i] = null;

        }
    }


    Trie() {

        this.head = new Node();
    }

    void insertData(String str) {
        Node temp = head;
        for (int i = 0; i < str.length(); i++) {

            int idx = str.charAt(i) - 'a';

            if (temp.next[idx] == null) {
                temp.next[idx] = new Node();
            }

            temp = temp.next[idx];
            temp.value += 1;

        }
        temp.isExact = true;


    }

    boolean isThere(String str) {

        Node temp = head;
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            if (temp.next[idx] == null)
                return false;
            temp = temp.next[idx];

        }
        if (temp.isExact)
            return true;
        return false;
    }

    int prefixMatchCount(String str) {
        Node temp = head;
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            if (temp.next[idx] == null)
                return 0;
            temp = temp.next[idx];

        }
        return temp.value;

    }


}
