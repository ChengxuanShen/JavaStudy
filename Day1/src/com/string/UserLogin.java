package com.string;

import java.util.Scanner;

/**
 * 已只正确用户名，密码，模拟用户登陆，
 * 共三次机会，登录后给出相应返回
 */

public class UserLogin {
    public static void main(String[] args) {
        String name = "Bob";
        String pwd = "123";

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String inputName = scanner.next();
            System.out.println("请输入密码：");
            String inputPwd = scanner.next();
            if (name.equals(inputName) && pwd.equals(inputPwd)) {
                System.out.println("Login success");
                break;
            } else {
                System.out.println("Please try again");
            }
        }
    }
}
