package com.collection;

import java.util.ArrayList;
import java.util.StringJoiner;

public class ReserveNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.size(); i++) {
            sj.add(arr.get(i).toString());
        }
        System.out.println(sj);
    }
}
