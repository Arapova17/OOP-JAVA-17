package LMS.TaskEncapsulation;

public class Car {
    private String marca;
    private String light;
    private int price;
    private String box;

    public String marca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String light() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public int price() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String box() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public Car[] createCar (Car[] cars, Car car){
        Car[] newCar = new  Car[cars.length + 1];

        int i = 0;
        while (i < cars.length){
            newCar[i] = cars[i];
            i++;
        }

        newCar[cars.length] = car;
        return newCar;
    }

    @Override
    public String toString() {
        return "\nCar" +
                "\nmarca = " + marca +
                "\nlight = " + light +
                "\nprice = " + price + "$" +
                "\nbox= " + box + "\n------------";
    }
}
