package com.polymorphism.Dto;

public class Animal {
    private int age;

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    private String color;

    public void eat(String someThing) {
        System.out.println("eat " + someThing + "...");
    };

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
