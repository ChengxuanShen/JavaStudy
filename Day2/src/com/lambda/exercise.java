package com.lambda;

import java.util.Arrays;

/**
 * exercise
 * 定义数组并存储女朋友对象，利用array中的sort方法进行排序
 * 要求：
 * 1. 属性：姓名，年龄，身高
 * 2. 按照年龄从大到小排序，年龄相同按照身高从小到大排序，身高相同按照姓名的字母顺序排序
 */
class GrilFriend {
    String name;
    int age;
    int height;

    public GrilFriend(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return name + ": " + age + "岁，" + "身高：" + height;
    }
}

public class exercise {
    public static void main(String[] args) {
        GrilFriend[] grilFriends = {
                new GrilFriend("小明", 18, 160),
                new GrilFriend("小王", 17, 170),
                new GrilFriend("b", 17, 180),
                new GrilFriend("a", 17, 180),
        };
        Arrays.sort(grilFriends, (a, b) -> a.age > b.age ? -1: a.height > b.height ? 1: a.name.compareTo(b.name));
//        Arrays.stream(grilFriends).forEach(System.out::println);
        System.out.println(Arrays.toString(grilFriends));
    }
}
