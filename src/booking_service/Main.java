package booking_service;

import booking_service.database.Database;
import booking_service.enums.Car;
import booking_service.models.Driver;
import booking_service.models.Management;
import booking_service.models.User;
import booking_service.service.ManagementService;
import booking_service.service.UserService;
import booking_service.service.serviceImpl.ManagementServiceImpl;
import booking_service.service.serviceImpl.UserServiceImpl;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        ManagementService managementService = new ManagementServiceImpl();

        System.out.println("Booking service. \nRegister and login: " +
                "\nRegister '1' \nLogin '2' \nWrite number!");

        while (true) {

            int num = new Scanner(System.in).nextInt();
            switch (num) {
                case 1:
                    System.out.println("Write the Management \nManagement '1': Asan \nCompany: 'Booking Service'" +
                            "\nManagement '2': Argen \nCompany: 'Booking Service'");
                    int management1 = new Scanner(System.in).nextInt();
                    if (management1 == 1) {
                        System.out.println("Register!");
                        managementService.addManagement(new Management(1, "Asan", "Booking Service"));
                        System.out.println(userService.register(1));
                        System.out.println(Arrays.toString(Database.managements));
                    } else if (management1 == 2) {
                        System.out.println("Register!");
                        managementService.addManagement(new Management(2, "Argen", "Booking Service"));
                        System.out.println(userService.register(2));
                        System.out.println(Arrays.toString(Database.managements));
                    }
                    System.out.println("Write number '2' {Login}");
                    break;
                case 2:
                    System.out.println("Login: ");
                    System.out.println(userService.login());
                    for (Car car : Car.values()) {
                        System.out.println("Welcome!" + "\nCars: " + car);
                        System.out.println("Write name car!");
                        break;
                    }
                for (Car car : Car.values()) {
                    switch (car) {
                        case BMW:
                            System.out.println("Booking!");
                            User user = new User(1, "Askat", "Aidarov", 25, "+996500123788");
                            System.out.println(user);
                            break;
                        case KIA:
                            System.out.println("Booking register!");
                            System.out.println(userService.bookingRegister());
                            break;
                    }
                }
            }

        }
    }
}
