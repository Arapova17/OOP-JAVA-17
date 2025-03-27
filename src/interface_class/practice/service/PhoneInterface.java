package interface_class.practice.service;

import abstract_class.Phone1;
import interface_class.practice.models.Contact;
import interface_class.practice.models.Phone;

public interface PhoneInterface {
    String turnOn(String command, Phone phone);

    Contact call(String name);

    Contact call(long phoneNumber);

    Contact update(String oldName, String newName);

    Contact[] getAllContact();

}
