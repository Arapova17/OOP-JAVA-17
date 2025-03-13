package CRUD;

import java.time.LocalDate;
import java.util.Arrays;

// CRUD - acronim methoddordun jyiyndycy;
// C - Create -> dannyi tuzup beret bazaga saktait //add // save
// R - Read -> saktalgan dannayidy chygaryp beret
// U - Update -> bazada saktalgan dannayidy ozgortup beret
// D - Delete -> bazada bar dannyidy ochurot

public class Customer {
    private long ID;
    private String firstName;
    private String gmail;
    private LocalDate localDate;
    private String phone;

    public long ID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String firstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String gmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public LocalDate localDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String phone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //TODO CRUD
    //TODO CREATE
    public void createCustomer(Customer[] customers, Customer customer){
        Customer[] newCustomers = new Customer[customers.length + 1];

        for (int i = 0; i < customers.length; ++i) {
            newCustomers[i] = customers[i];
        }

        newCustomers[customers.length] = customer;
        customers = newCustomers;
        System.out.println(Arrays.toString(customers));
    }

    //TODO GetALL
    public Customer[] getAllCustomers(Customer[] customers){
        return customers;
    }

    @Override
    public String toString() {
        return "Customer; " +
                "\nID= " + ID +
                "\nfirstName = " + firstName +
                "\ngmail = " + gmail +
                "\nlocalDate = " + localDate +
                "\nphone = " + phone ;
    }

}
