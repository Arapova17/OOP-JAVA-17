package oop.polymorphism;

public class Cat extends Animal{
    private String color;

    @Override
    public void voice() {
        System.out.println("mau - mau");
    }

    public void walk (){
        System.out.println("This cat is walked");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                '}';
    }
}
