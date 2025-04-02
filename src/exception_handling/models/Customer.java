package exception_handling.models;

import exception_handling.enums.Gender;

public class Customer {
    private long id;
    private String name;
    private Gender gender;
    private String phoneNumber;
    private String email;
    private String password;

    public Customer() {
    }

    public Customer(long id, String name, Gender gender, String phoneNumber, String email, String password) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
    }

    public long id() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender gender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String email() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String password() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
