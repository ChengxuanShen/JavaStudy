package com.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class lambda {
    public static void main(String[] args) {
        Integer[] arr = {12, 3, 5, 10, 7, 8, 6, 7};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? -1 : 1;
            }
        });
        System.out.println(Arrays.toString(arr));

        /**
         * lambda表达式
         */
        Arrays.sort(arr, (a, b) -> a > b ? -1: 1);
    }
}
