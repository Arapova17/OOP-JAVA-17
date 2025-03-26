package abstract_class;

import java.time.LocalDate;

public class Laptop extends Device{
    private String processor;
    private String RAM;

    public Laptop(){
    }

    public Laptop(String processor, String RAM) {
        this.processor = processor;
        this.RAM = RAM;
    }

    public Laptop(String brand, int price, int id, String operatingSystem, String color, LocalDate yearOfIssue, String processor, String RAM) {
        super(brand, price, id, operatingSystem, color, yearOfIssue);
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
    // TODO CRUD

    Device[] laptops = new Laptop[10];
    int laptopCount = 0;

    @Override
    public void addDevice(Device device) {
        laptops[laptopCount++] = device;
    }

    @Override
    public Device[] getAllDevice() {
        return new Device[0];
    }

    @Override
    public Device getById(int id) {
        return null;
    }

    @Override
    public void updateDevice(int id, Device device) {

    }

    @Override
    public Device deleteDevice(int id) {
        return null;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + processor + '\'' +
                ", RAM='" + RAM + '\'' +
                super.brand() +
                '}';
    }
}
