package CRUD;

import java.time.LocalDate;
import java.util.Arrays;

public class CRUDMain {
    public static void main(String[] args) {

        // TODO DATABASE
        Customer[] customers = new Customer[0];
        Customer customer = new Customer();

//        for (int i = 0; i < customers.length; i++) {
//            customers[i] = customer;
//        }
//        Customer customer1 = new Customer();
//        for (int i = 0; i < customers.length; i++) {
//            customers[i] = customer1;
//        }

        customer.setID(1L);
        customer.setFirstName("hh");
        customer.setGmail("@");
        customer.setLocalDate(LocalDate.of(2004,3,3));
        customer.setPhone("21");

//        System.out.println(Arrays.toString(customer.createCustomer(customers, customer)));

        System.out.println("All Customers " + Arrays.toString(customer.getAllCustomers(customers)));
    }
}
