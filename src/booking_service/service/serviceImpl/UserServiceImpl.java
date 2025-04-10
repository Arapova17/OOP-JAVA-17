package booking_service.service.serviceImpl;

import booking_service.database.Database;
import booking_service.models.Management;
import booking_service.models.User;
import booking_service.service.UserService;
import exception_handling.exception.MyException;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
    int userCount = 0;
    @Override
    public String register(long managementId) {
        try{
            User user = new User();
            System.out.println("Write first name: " );
            user.setFirstName(new Scanner(System.in).nextLine());
            System.out.println("Write last name: ");
            user.setLastName(new Scanner(System.in).nextLine());
            System.out.println("Write the age: ");
            int age = new Scanner(System.in).nextInt();
            if (!(age > 17)){
                throw new MyException("Age > 17!");
            }else {
                user.setAge(age);
            }

            System.out.println("Write the phone number: ");
            String phoneNumber = new Scanner(System.in).nextLine();
            if (!phoneNumber.matches("\\+996\\d{9}")){
                throw new MyException("The phone number is incorrect! \n+996");
            }else {
                user.setPhoneNumber(phoneNumber);
            }

            System.out.println("Write the gmail: ");
            String gmail = new Scanner(System.in).nextLine();
            if (!gmail.contains("@")){
                throw new MyException("The gmail is incorrect! \n'@'");
            }else {
                user.setGmail(gmail);
            }

            System.out.println("Write the password:");
            String password = new Scanner(System.in).nextLine();
            if (!password.matches("\\d{6}")){
                throw new MyException("The password is incorrect! \nMust be '6' digits long");
            }else {
                user.setPassword(password);
            }

            if (Database.managements == null){
                throw new MyException("User is null!");
            }

            for (Management management : Database.managements){
                if (management.id() == managementId){
                    management.users()[userCount++] = user;
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
            System.out.println("Write gmail: ");
            String gmail = new Scanner(System.in).nextLine();

            System.out.println("Write password: ");
            String password = new Scanner(System.in).nextLine();

            for (Management management : Database.managements){
                for (User user : management.users()){
                    if (user.gmail().equals(gmail) && user.password().equals(password)){
                        return "Success!";
                    }else throw new MyException("Incorrect email or password!");
                }
            }
        }catch (MyException e){
            return "Login failed: " + e.getMessage();
        }
        return "";
    }

    @Override
    public String bookingRegister() {
        try{
            User user = new User();
            System.out.println("Write first name: ");
            user.setFirstName(new Scanner(System.in).nextLine());

            System.out.println("Write last name: ");
            user.setLastName(new Scanner(System.in).nextLine());

            System.out.println("Write age:");
            user.setAge(new Scanner(System.in).nextInt());

            System.out.println("Write phone number:");
            user.setPhoneNumber(new Scanner(System.in).nextLine());
            return "The car is booked!";
        }catch (MyException e){
            return e.getMessage();
        }

    }
}
