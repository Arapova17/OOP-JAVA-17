package task_booking_service;

import java.time.LocalDate;

public class Customer {
    private long id;
    private String firstName;
    private String lastName;
    private LocalDate data;
    private String gmail;
    private String password;

    public Customer() {
    }

    public Customer(long id, String firstName, String lastName, LocalDate data, String gmail, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.data = data;
        this.gmail = gmail;
        this.password = password;
    }

    public long id() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String firstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String lastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate data() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String gmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
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
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", data=" + data +
                ", gmail='" + gmail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
