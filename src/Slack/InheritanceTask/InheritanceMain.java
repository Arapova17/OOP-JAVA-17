package Slack.InheritanceTask;

import java.util.Scanner;

public class InheritanceMain {
    public static void main(String[] args) {


        System.out.println("On / Off");
        String onOff = new Scanner(System.in).nextLine();
        Phone phone = new Phone("Phone", "MI", 15, "Redmi");

        System.out.println(phone.turnOnOff(onOff));
    }
}
