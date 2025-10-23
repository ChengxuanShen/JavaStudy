package com.string;

import java.util.StringJoiner;

/**
 * Example:
 * int[] arr = {1,2,3}
 * 返回结果 [1,2,3]
 */
public class ConcatString {
    public static void main(String[] args) {
        System.out.println(ConcatString.concat(new int[]{1,2,3}));
    }

    public static String concat(int[] arr) {
        /**
         * 方法1 StringBuilder
         */
        /**
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i == arr.length - 1) continue;
            sb.append(",");
        }
        return sb.append("]").toString();
         */
        /**
         * 方法2 StringJoiner
         */
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i] + "");
        }
        return sj.toString();
    }
}
