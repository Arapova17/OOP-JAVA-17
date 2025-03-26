package abstract_class;

import java.time.LocalDate;

public abstract class Device {
    private String brand;
    private int price;
    private int id;
    private String operatingSystem;
    private String color;
    private LocalDate yearOfIssue;

    public Device() {
    }

    public Device(String brand, int price, int id, String operatingSystem, String color, LocalDate yearOfIssue) {
        this.brand = brand;
        this.price = price;
        this.id = id;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }

    public Device(String brand, int price, String operatingSystem, String color, LocalDate yearOfIssue) {

    }

    public String brand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int price() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String operatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String color() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate yearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(LocalDate yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public abstract void addDevice(Device device);

    public abstract Device[] getAllDevice();

    public abstract Device getById(int id);

    public abstract void updateDevice(int id, Device device);

    public abstract Device deleteDevice(int id);

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
