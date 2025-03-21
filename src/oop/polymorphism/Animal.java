package oop.polymorphism;

public class Animal {
    private String name;

    public void voice (){
        System.out.println("Some voice");
    }



    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
