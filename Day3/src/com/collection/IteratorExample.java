package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<String>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String it = iterator.next();
            System.out.println(it);
            if (it.equals("ccc")) {
                collection.remove(it);
            }
        }

        /**
         * 增强for循环，底层使用的就是iterator，只是写法的简化
         */
        for (String s: collection) {
            System.out.println(s);
        }

        /**
         * lambda表达式
         */
        collection.forEach(System.out::println);
    }
}
