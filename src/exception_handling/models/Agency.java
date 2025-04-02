package exception_handling.models;

import java.time.LocalDate;
import java.util.Arrays;

public class Agency {
    private long id;
    private String name;
    private String address;
    private LocalDate foundationDate;
    private House[] houses = new House[10];
    private Customer[] customers = new Customer[10];

    public Agency() {
    }

    public Agency(long id, String name, String address, LocalDate foundationDate, House[] houses, Customer[] customers) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.foundationDate = foundationDate;
        this.houses = houses;
        this.customers = customers;
    }

    public Agency(long id, String name, String address, LocalDate foundationDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.foundationDate = foundationDate;
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

    public String address() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate foundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(LocalDate foundationDate) {
        this.foundationDate = foundationDate;
    }

    public House[] houses() {
        return houses;
    }

    public void setHouses(House[] houses) {
        this.houses = houses;
    }

    public Customer[] customers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Agency{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", foundationDate=" + foundationDate +
                ", houses=" + Arrays.toString(houses) +
                ", customers=" + Arrays.toString(customers) +
                '}';
    }
}
