package com.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 定义一个集合，并添加一些整数：1, 2, 3, 4, 5, 6, 7, 8, 9, 10
 * 过滤奇数只留下偶数
 * 并将结果保存起来
 */
public class DataFilter {
    public static void main(String[] args) {
        Collection<Integer> l = new ArrayList<>();
        Collections.addAll(l, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }
}
