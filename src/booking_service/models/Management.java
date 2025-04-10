package booking_service.models;

import booking_service.enums.Car;

import java.util.Arrays;

public class Management {
    private long id;
    private String managementName;
    private String companyName;
    private User[] users = new User[10];
    private Car[] cars = new  Car[10];
    private Driver[] drivers = new Driver[10];

    public Management() {
    }

    public Management(long id, String managementName, String companyName) {
        this.id = id;
        this.managementName = managementName;
        this.companyName = companyName;
    }

    public Management(long id, String managementName, String companyName,
                      User[] users, Car[] cars, Driver[] drivers) {
        this.id = id;
        this.managementName = managementName;
        this.companyName = companyName;
        this.users = users;
        this.cars = cars;
        this.drivers = drivers;
    }

    public long id() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String managementName() {
        return managementName;
    }

    public void setManagementName(String managementName) {
        this.managementName = managementName;
    }

    public String companyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public User[] users() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Car[] cars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public Driver[] drivers() {
        return drivers;
    }

    public void setDrivers(Driver[] drivers) {
        this.drivers = drivers;
    }

    @Override
    public String toString() {
        return "Management{" +
                "id=" + id +
                ", managementName='" + managementName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", users=" + Arrays.toString(users) +
                ", cars=" + Arrays.toString(cars) +
                ", drivers=" + Arrays.toString(drivers) +
                '}';
    }
}
