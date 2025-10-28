package com.collection;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * 创建集合添加元素
 * 1. 把所有“张”开头的元素存储到新集合中
 * 2. 把“张”开头的，长度为三的元素存储到新集合中
 * 3. 遍历打印最终结果
 */
public class StreamExample {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张无忌");
        list1.add("赵敏");
        list1.add("周芷若");
        list1.add("张强");
        list1.add("张三丰");

        ArrayList<String> list2 = new ArrayList<>();
        list1.stream().parallel().forEach(s -> {
            if (s.startsWith("张")) {
                list2.add(s);
            }
        });
        for (String s : list2) {
            System.out.println(s);
        }
    }
}
