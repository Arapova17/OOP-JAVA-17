package interface_class.practice.models;

public class Contact {
    private  String fulName;
    private long phoneNumber;

    public Contact() {
    }

    public Contact(String fulName, long phoneNumber) {
        this.fulName = fulName;
        this.phoneNumber = phoneNumber;
    }

    public String fulName() {
        return fulName;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public long phoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\nContact" +
                "\nful Name = " + fulName +
                "\nphone Number = " + phoneNumber;
    }
}
