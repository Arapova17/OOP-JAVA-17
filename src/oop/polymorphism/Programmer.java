package oop.polymorphism;

public class Programmer extends Person{

    @Override
    public String walk() {
        return super.walk();
    }

    @Override
    public String toString() {
        return super.toString() + " Programmer " + super.walk();
    }
}
