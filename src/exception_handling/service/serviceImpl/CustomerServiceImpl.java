package exception_handling.service.serviceImpl;

import exception_handling.database.Database;
import exception_handling.enums.Gender;
import exception_handling.exception.MyException;
import exception_handling.models.Agency;
import exception_handling.models.Customer;
import exception_handling.service.CustomerService;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    int customerCount = 0;
    @Override
    public String register(long agencyId) {


        try {
            Customer customer = new Customer();
            System.out.println("Write name: ");
            customer.setName(new Scanner(System.in).nextLine());
            System.out.println("Write phone number: ");
            String phoneNumber = new Scanner(System.in).nextLine();
            if (!phoneNumber.matches("\\+996\\d{9}")){
                throw new  MyException("*phoneNumber созсуз турдо +996 менен башталышы керек жана 13\n" +
                        "цифрадан турушу керек ");
            }else {
                customer.setPhoneNumber(phoneNumber);
            }

            System.out.println("Write email: ");
            String email = new Scanner(System.in).nextLine();
            if (!email.contains("@")){
                throw new MyException("*gmail созсуз турдо @ символун камтышы керек.");
            }else {
                customer.setEmail(email);
            }

            System.out.println("Write password: ");
            customer.setPassword(new Scanner(System.in).nextLine());
            System.out.println("Write gender(MALE/FEMALE): ");
            String gender = new Scanner(System.in).nextLine();
            if (gender.equalsIgnoreCase("FEMALE")){
                customer.setGender(Gender.FEMALE);
            } else if (gender.equalsIgnoreCase("MALE")) {
                customer.setGender(Gender.MALE);
            }else {
                throw new MyException("Gender must be either 'Male' or 'Female'");
            }

            if (Database.agencies == null){
                throw new MyException("Agency is null");
            }


            for (Agency agency_db : Database.agencies){
                if (agency_db.id() == agencyId){
//                    for (int i = 0; i < agency_db.customers().length; i++) {
//                        agency_db.customers()[i] = customer;
//                    }
                    agency_db.customers()[customerCount++] = customer;
                    break;
                }
            }

        }catch (MyException e){
            return "Registration failed: " + e.getMessage();
        }
            return null;
    }

    @Override
    public String login() {
        try{
            System.out.println("Write email: ");
            String consolEmail = new Scanner(System.in).nextLine();

            System.out.println("Write password: ");
            String consolPassword = new Scanner(System.in).nextLine();

            for (Agency agency : Database.agencies){
                for (Customer customer : agency.customers()){
                    if (customer.email().equals(consolEmail) && customer.password().equals(consolPassword)){
                        return "Success!";
                    }else throw new MyException("Incorrect email or password!");
                }
            }
        }catch (MyException e){
            return "Login failed: " + e.getMessage();
        }
        return "";
    }
}
