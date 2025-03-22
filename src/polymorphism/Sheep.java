package polymorphism;

public class Sheep extends Animal{

    public Sheep() {
    }

    public Sheep(String name, int age, String color, String weight) {
        super(name, age, color, weight);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
