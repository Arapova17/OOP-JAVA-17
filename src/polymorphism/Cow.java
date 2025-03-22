package polymorphism;

public class Cow extends Animal {
    public Cow() {
    }

    public Cow(String name, int age, String color, String weight) {
        super(name, age, color, weight);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
