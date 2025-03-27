package abstract_class;

import java.time.LocalDate;

public class Phone1 extends Device{
    private String camera;
    private boolean isSupport5g;

    public Phone1() {
    }

    public Phone1(long id, String brand, int price, String operatingSystem, String color,
                  LocalDate yearOfIssue, String camera, boolean isSupport5g) {
        super(id, brand, price, operatingSystem, color, yearOfIssue);
        this.camera = camera;
        this.isSupport5g = isSupport5g;
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

    // TODO CRUD:

    Device[] phone = new Phone1[5];
    int phoneCount = 0;

    // create;
    @Override
    public void addDevice(Device device) {

        phone[phoneCount++] = device;

    }


    //read;
    @Override
    public Device[] getAllDevice() {
        System.out.println("Success!");
        return phone;
    }

    @Override
    public Device getById(long id) {
        for (Device phones : phone) {
            if (phones.id() == id) {
                return phones;
            }
        }
        return null;
    }

    //update;
    @Override
    public void updateDevice(long id, Device device) {
        Device phone = getById(id);
        phone.setBrand(device.brand());
        phone.setPrice(device.price());
        phone.setOperatingSystem(device.operatingSystem());
        phone.setColor(device.color());
        phone.setYearOfIssue(device.yearOfIssue());
        System.out.println("Success!");
    }

    //delete;
    @Override
    public void deleteDevice(long id) {
        int index = - 1;
        for (int i = 0; i < phone.length; i++) {
            if (phone[i].id() == id){
                index = i;
                break;
            }
        }

        Device[] newDevice = new Phone1[phone.length - 1];
        for (int i = 0; i < index; i++) {
            newDevice[i] = phone[i];
        }

        for (int i = index; i < newDevice.length; i++) {
            newDevice[i] = phone[i + 1];
        }

        phone = newDevice;
    }

    @Override
    public String toString() {
        return "\nPhone" +
                "\ncamera = " + camera +
                "\nis Support 5g = " + isSupport5g + super.toString();
    }
}
