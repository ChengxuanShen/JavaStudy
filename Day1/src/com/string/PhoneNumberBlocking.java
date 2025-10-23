package com.string;

/**
 * Example: 131 1212 1874
 * output: 131 **** 1874
 */
public class PhoneNumberBlocking {
    public static void main(String[] args) {
        String phoneNum = "13112121874";
        System.out.println(numberBlocking(phoneNum));
    }

    public static String numberBlocking(String phoneNumber) {
        return phoneNumber.substring(0, 3) + "****" + phoneNumber.substring(7);
    }
}
