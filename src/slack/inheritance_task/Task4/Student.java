package slack.inheritance_task.Task4;

import java.util.Arrays;

public class Student {
    private String fullName;
    private String phoneNumber;
    private String address;
    private int bankAccount;

    public Student() {
    }

    public Student(String fullName, String phoneNumber, String address, int bankAccount) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.bankAccount = bankAccount;
    }

    public String fullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String address() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int bankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void living(Apartment apartment, Student [] students) {
        int month;
        for (Student student : students){
                month = student.bankAccount / apartment.rent;
            System.out.print("\n" + student.fullName + "\nУшунча ай жашай аласыз; " + month );

        }
    }

    @Override
    public String toString() {
        return "Name = " + fullName +
                "\nphone Number = " + phoneNumber +
                "\naddress = " + address +
                "\nbank account = " + bankAccount +
               "\n------------------\n";
    }
}


