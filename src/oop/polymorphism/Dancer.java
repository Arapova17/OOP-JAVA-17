package oop.polymorphism;

public class Dancer extends Person{


    @Override
    public String walk() {
        return super.walk();
    }

    @Override
    public String toString() {
        return super.toString() + " Dancer " + super.walk();
    }
}
