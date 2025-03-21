package oop.polymorphism;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Animal animal = new Animal();
//
//        Cat cat = new Cat(); // 1
//        cat.voice();
//        cat.walk();
//
//        Animal cat1 = new Cat(); // 2
//        cat1.voice();
//
//        Animal dog = new Dog();
//
//        Animal[] animals = {animal, cat, cat1, dog};
//        Animal[] animals1 = {new Animal(),
//                new Cat(),
//                new Dog()};
//
//        System.out.println(Arrays.toString(animals));
//
//        Object cat2 = new Cat(); // 3

        Person [] persons = {
                new Programmer(),
                new Dancer(),
                new Singer()
        };
        System.out.println(Arrays.toString(persons));


    }
}
