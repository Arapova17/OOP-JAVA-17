package abstract_class;

public abstract class Car {
    private String model;
    private String color;
    private String maxSpeed;

    public Car() {
    }

    public Car(String model, String color, String maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String model() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String color() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String maxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract void gas();

    public abstract void brake();

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                '}';
    }
}
