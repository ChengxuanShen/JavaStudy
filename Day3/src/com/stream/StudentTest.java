package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 集合中存储一些字符串数据，比如：张三,23
 * 收集到Student类型的数组中（使用方法引用完成）
 */
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    public Student(String str) {
        String[] stuStr = str.split(",");
        this.name = stuStr[0];
        this.age = Integer.parseInt(stuStr[1]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.age;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "张三,23", "李四,24");
//        cmd + option + v自动补全变量
        Student[] students = arrayList.stream().map(Student::new).toArray(Student[]::new);
        System.out.println(Arrays.toString(students));
    }
}
