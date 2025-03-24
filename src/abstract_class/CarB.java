package abstract_class;

public class CarB extends Car{

    public CarB() {
    }

    public CarB(String model, String color, String maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("Car b gas");
    }

    @Override
    public void brake() {
        System.out.println("Car b gas");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
