package abstract_class;

public class CarC extends Car{

    public CarC() {
    }

    public CarC(String model, String color, String maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("Car c gas");
    }

    @Override
    public void brake() {
        System.out.println("Car c brake");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
