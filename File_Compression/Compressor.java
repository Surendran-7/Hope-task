package com.compression;

import java.io.*;
import java.util.*;

public class Compressor {

    private HuffmanService service = new HuffmanService();

    public Node compress(String inputFile, String outputFile) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        String text = br.readLine();
        br.close();

        Map<Character, Integer> freqMap = service.buildFrequency(text);

        Node root = service.buildTree(freqMap);

        Map<Character, String> codeMap = new HashMap<>();
        service.generateCodes(root, "", codeMap);

        StringBuilder encoded = new StringBuilder();
        for (char ch : text.toCharArray()) {
            encoded.append(codeMap.get(ch));
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
        bw.write(encoded.toString());
        bw.close();

        System.out.println("Compressed Successfully!");
        System.out.println("Codes: " + codeMap);

        return root;
    }

    public String readCompressed(String file) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String data = br.readLine();
        br.close();
        return data;
    }
}
