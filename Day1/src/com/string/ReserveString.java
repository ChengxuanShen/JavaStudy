package com.string;

import java.util.Scanner;

/**
 * 键盘录入字符串，程序在控制台便利字符串
 */
public class ReserveString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
