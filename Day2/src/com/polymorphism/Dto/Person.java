package com.polymorphism.Dto;

public class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void keepPet(Animal animal, String something) {
        if (animal instanceof Dog) {
            System.out.println(this.name + " keep " + animal.getAge() + " year old " + animal.getColor() + " Dog");
        } else if (animal instanceof Cat) {
            System.out.println(this.name + " keep " + animal.getAge() + " year old " + animal.getColor() + " Cat");
        }
        animal.eat(something);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
