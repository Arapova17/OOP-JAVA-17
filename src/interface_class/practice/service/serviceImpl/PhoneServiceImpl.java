package interface_class.practice.service.serviceImpl;

import interface_class.practice.database.Database;
import interface_class.practice.models.Contact;
import interface_class.practice.models.Phone;
import interface_class.practice.service.PhoneInterface;

import java.util.Scanner;

public class PhoneServiceImpl implements PhoneInterface {
    @Override
    public String turnOn(String command, Phone phone) {
        if (command.equals("On")){
            System.out.println("Please write password: ");
            if (phone.getPassword().equals(new Scanner(System.in).nextLine())){
                return "Phone is on!";
            }
        }
        return "Incorrect password! Try again";
    }

    @Override
    public Contact call(String name) {
        for (Contact contact : Database.contacts){
            if (contact.fulName().equals(name)){
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact call(long phoneNumber) {
        for (Contact contact : Database.contacts){
            if (contact.phoneNumber() == phoneNumber){
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact update(String oldName, String newName) {
        for (Contact contact : Database.contacts){
            if (contact.fulName().equals(oldName)){
                contact.setFulName(newName);
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact[] getAllContact() {
        return Database.contacts;
    }
}
