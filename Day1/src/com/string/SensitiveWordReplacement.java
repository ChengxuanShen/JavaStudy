package com.string;

public class SensitiveWordReplacement {
    public static void main(String[] args) {
        String sentence = "你 TMD";
        System.out.println(sensitiveWordReplacement(sentence));
    }

    public static String sensitiveWordReplacement(String sentence) {
        return sentence.replace("TMD", "***");
    }
}
