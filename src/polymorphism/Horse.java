package polymorphism;

public class Horse extends Animal{

    public Horse() {
    }

    public Horse(String name, int age, String color, String weight) {
        super(name, age, color, weight);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
