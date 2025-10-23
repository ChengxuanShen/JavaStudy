package com.string;

import java.util.Scanner;

/**
 * 键盘录入字符串，
 * 函数返回反转后的字符串
 */
public class RevertString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(revert(s));
    }

    public static String revert(String s) {
        String res = "";
        for (int i = s.length() - 1; i >= 0 ; i--) {
            res += s.charAt(i);
        }
        return res;
    }
}
