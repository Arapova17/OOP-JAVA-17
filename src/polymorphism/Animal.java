package polymorphism;

public class Animal {
    String name;
    int age;
    String color;
    String weight;

    public Animal() {
    }

    public Animal(String name, int age, String color, String weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\nname = " + name +
                "\nage = " + age +
                "\ncolor = " + color +
                "\nweight = " + weight ;
    }
}
