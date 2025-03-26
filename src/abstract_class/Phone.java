package abstract_class;

import java.time.LocalDate;

public class Phone extends Device{
    private int id;
    private String camera;
    private boolean isSupport5g;

    public Phone(){
    }

    public Phone(int id, String camera, boolean isSupport5g) {
        this.id = id;
        this.camera = camera;
        this.isSupport5g = isSupport5g;
    }

    public Phone(String brand, int price, int id, String operatingSystem, String color, LocalDate yearOfIssue, String camera, boolean isSupport5g) {
        super(brand, price, id, operatingSystem, color, yearOfIssue);
        this.camera = camera;
        this.isSupport5g = isSupport5g;
    }

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void addDevice(Device device) {

    }

    public String camera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public boolean isSupport5g() {
        return isSupport5g;
    }

    public void setSupport5g(boolean support5g) {
        isSupport5g = support5g;
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
        return "Phone{" +
                "camera='" + camera + '\'' +
                ", isSupport5g=" + isSupport5g +
                super.toString() +
                '}';
    }
}
