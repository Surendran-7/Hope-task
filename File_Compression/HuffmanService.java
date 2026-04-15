package com.compression;

import java.util.*;

public class HuffmanService {

    // Build frequency map
    public Map<Character, Integer> buildFrequency(String text) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : text.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        return freqMap;
    }

    // Build Huffman Tree
    public Node buildTree(Map<Character, Integer> freqMap) {
        PriorityQueue<Node> pq = new PriorityQueue<>();

        for (char ch : freqMap.keySet()) {
            pq.add(new Node(ch, freqMap.get(ch)));
        }

        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();

            Node parent = new Node('\0', left.freq + right.freq);
            parent.left = left;
            parent.right = right;

            pq.add(parent);
        }

        return pq.poll();
    }

    // Generate codes
    public void generateCodes(Node root, String code, Map<Character, String> map) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            map.put(root.ch, code);
        }

        generateCodes(root.left, code + "0", map);
        generateCodes(root.right, code + "1", map);
    }

    // Decompression merged here
    public String decompress(String encoded, Node root) {
        StringBuilder decoded = new StringBuilder();
        Node curr = root;

        for (char bit : encoded.toCharArray()) {
            if (bit == '0') curr = curr.left;
            else curr = curr.right;

            if (curr.left == null && curr.right == null) {
                decoded.append(curr.ch);
                curr = root;
            }
        }

        return decoded.toString();
    }
}
