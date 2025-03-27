package interface_class.practice;

import interface_class.practice.database.Database;
import interface_class.practice.models.Phone;
import interface_class.practice.service.MessageFormatter;
import interface_class.practice.service.PhoneInterface;
import interface_class.practice.service.serviceImpl.PhoneServiceImpl;
import interface_class.practice.service.serviceImpl.lowerCase;
import interface_class.practice.service.serviceImpl.upperCase;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Phone phone = new Phone("IPhone", "Apple", "12345", Database.contacts);
//
//        PhoneInterface phoneInterface = new PhoneServiceImpl();
//        System.out.println("On / Off");
//        System.out.println(phoneInterface.turnOn(new Scanner(System.in).nextLine(), phone));
//        System.out.println("Write name: ");
//        System.out.println(phoneInterface.call(new Scanner(System.in).nextLine()) + " qudok....");
//        System.out.println("Write phone number: ");
//        System.out.println(phoneInterface.call(new Scanner(System.in).nextLong()) + " qudok....");
//
//        System.out.println("Write the old name and new name: ");
//        System.out.println(phoneInterface.update(new Scanner(System.in).nextLine(), new Scanner(System.in).nextLine()));
//
//        System.out.println(Arrays.toString(phoneInterface.getAllContact()));

        MessageFormatter messageFormatter = new upperCase();
        System.out.println(messageFormatter.formatMessage(new Scanner(System.in).nextLine()));
        MessageFormatter messageFormatter1 = new lowerCase();
        System.out.println(messageFormatter1.formatMessage(new Scanner(System.in).nextLine()));
    }
}
