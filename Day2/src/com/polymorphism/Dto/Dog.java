package com.polymorphism.Dto;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String someThing) {
        System.out.println(super.getAge() + " year old " + super.getColor() + " Dog, eat" + someThing);
    };

    public void lookHome() {
        System.out.println("look home...");
    };
}
