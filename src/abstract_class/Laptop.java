package abstract_class;

import java.time.LocalDate;
import java.util.Arrays;

public class Laptop extends Device {
    private String processor;
    private String RAM;

    public Laptop() {
    }

    public Laptop(long id, String brand, int price, String operatingSystem, String color,
                  LocalDate yearOfIssue, String processor, String RAM) {
        super(id, brand, price, operatingSystem, color, yearOfIssue);
        this.processor = processor;
        this.RAM = RAM;
    }

    public String processor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String RAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    // TODO CRUD:

    Device[] laptops = new Laptop[10];
    int laptopCount = 0;

    @Override
    public void addDevice(Device device) {
        laptops[laptopCount++] = device;
        System.out.println("Success!");
    }

    @Override
    public Device[] getAllDevice() {
        return laptops;
    }

    @Override
    public Device getById(long id) {
        for (Device laptop : laptops) {
            if (laptop.id() == id) {
                return laptop;
            }
        }
        return null;
    }

    @Override
    public void updateDevice(long id, Device device) {
        Device laptop = getById(id);
        laptop.setBrand(device.brand());
        laptop.setPrice(device.price());
        laptop.setColor(device.color());
        laptop.setOperatingSystem(device.operatingSystem());
        laptop.setYearOfIssue(device.yearOfIssue());
        System.out.println("Success!");
    }

    @Override
    public void deleteDevice(long id) {
        int index = - 1;
        for (int i = 0; i < laptops.length; i++) {
            if (laptops[i].id() == id){
                index = i;
                break;
            }
        }

        Device[] newDevice = new Laptop[laptops.length - 1];
        for (int i = 0; i < index; i++) {
            newDevice[i] = laptops[i];
        }

        for (int i = index; i < newDevice.length; i++) {
            newDevice[i] = laptops[i + 1];
        }

        laptops = newDevice;
    }

    @Override
    public String toString() {
        return "\nLaptop" +
                "\nprocessor = " + processor + '\'' +
                "\nRAM = " + RAM + super.toString();
    }
}
