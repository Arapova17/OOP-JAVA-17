package oop.polymorphism;

public class Dog extends Animal{
    private String paroda;

    @Override
    public String toString() {
        return "Dog{" +
                "paroda='" + paroda + '\'' +
                '}';
    }
}
