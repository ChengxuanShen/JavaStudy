package com.polymorphism.Dto;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String someThing) {
        System.out.println(super.getAge() + " year old " + super.getColor() + " Cat, eat" + someThing);
    };

    public void catchMouse() {
        System.out.println("look home...");
    };
}
