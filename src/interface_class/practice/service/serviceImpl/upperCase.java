package interface_class.practice.service.serviceImpl;

import interface_class.practice.service.MessageFormatter;

public class upperCase implements MessageFormatter {
    @Override
    public String formatMessage(String message) {
        return message.toUpperCase();
    }
}
