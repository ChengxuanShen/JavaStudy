package com.polymorphism;

import com.polymorphism.Dto.Cat;
import com.polymorphism.Dto.Dog;
import com.polymorphism.Dto.Person;

public class Polymorphism {
    public static void main(String[] args) {
        Person person = new Person(30, "老王");
        Dog dog = new Dog(2, "black");
        person.keepPet(dog, "Bones");


        Person laoli = new Person(25, "老李");
        Cat cat = new Cat(3, "grey");
        laoli.keepPet(cat, "Mouse");
    }

}