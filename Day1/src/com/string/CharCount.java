package com.string;

import java.util.Scanner;

/**
 * 键盘录入字符串，统计字符串中大写字符字母，小写字符字母，数字字符出现的次数
 */
public class CharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int upperCase = 0;
        int lowerCase = 0;
        int numberCase = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                numberCase ++;
            } else if (c >= 'a' && c <= 'z') {
                lowerCase ++;
            } else if (c >= 'A' && c <= 'Z') {
                upperCase ++;
            }
        }
        System.out.println("小写字母：" + lowerCase);
        System.out.println("大写字母：" + upperCase);
        System.out.println("数字字母：" + numberCase);
    }
}
