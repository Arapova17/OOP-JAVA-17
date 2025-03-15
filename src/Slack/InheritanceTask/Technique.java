package Slack.InheritanceTask;

import java.util.Scanner;

public class Technique {
    private String name;
    private String brand;
    private int version;

    public Technique() {
    }

    public Technique(String name, String brand, int version) {
        this.name = name;
        this.brand = brand;
        this.version = version;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String brand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int version() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    String basePassword = "1234";
    public String turnOnOff(String onOff){

        if (onOff.equalsIgnoreCase("On")){
            System.out.println(name + "turned on");
            System.out.println("Please write password: ");
            String password = new Scanner(System.in).nextLine();
            if (password.equals(basePassword)){
                return "Welcome!";
            }else{
                return "Error!!!";
            }
        }else if (onOff.equalsIgnoreCase("off")){
            return name + "turned off";
        }
        return null;
    }


    @Override
    public String toString() {
        return "Technique{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", version=" + version +
                '}';
    }
}
