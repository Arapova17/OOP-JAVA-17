package oop.polymorphism;

public class Singer extends Person{


    @Override
    public String walk() {
        return super.walk();
    }

    @Override
    public String toString() {
        return super.toString() + " Singer " +
                super.walk();
    }
}
