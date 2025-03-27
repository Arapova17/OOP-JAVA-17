package abstract_class;

import java.time.LocalDate;

public abstract class Device {
    private long id;
    private String brand;
    private int price;
    private String operatingSystem;
    private String color;
    private LocalDate yearOfIssue;

    public Device() {
    }

    public Device(long id, String brand, int price, String operatingSystem, String color, LocalDate yearOfIssue) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }

    public long id() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public abstract Device getById(long id);

    public abstract void updateDevice(long id, Device device);

    public abstract void deleteDevice(long id);

    @Override
    public String toString() {
        return "\nDevice" +
                "\nid = " + id +
                "\nbrand = " + brand +
                "\nprice = " + price +
                "\noperating System = " + operatingSystem +
                "\ncolor = " + color +
                "\nyear Of Issue = " + yearOfIssue +
                "\n-----------------";
    }
}
