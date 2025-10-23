package com.string;

import java.util.Scanner;

/**
 * Example: 123321 => true
 * 12345 => false
 * 请使用StringBuilder
 */
public class SymmetricalString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        System.out.println(isSymmetricalString(scanner.next()));
    }

    public static boolean isSymmetricalString(String s) {
        StringBuilder sb = new StringBuilder();
        return sb.append(s).reverse().toString().equals(s);
    }

}
