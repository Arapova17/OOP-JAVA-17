package slack.inheritance_task;

import java.util.Scanner;

public class Technique {
    private String name;
    private String brand;
    private int version;

    public Technique(String name, String brand, int version){
        this.name = name;
        this.brand =brand;
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

    public String turnOnOff() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(name + " - Иштетүү же өчүрүү (On / Off): ");
        String state = scanner.nextLine();

        if (state.equalsIgnoreCase("On")) {
            if (this instanceof Phone || this instanceof Computer) {
                System.out.print("Сырсөз киргизиңиз: ");
                String password = scanner.nextLine();
                if (!password.equals("1234")) {
                    return "Туура эмес сырсөз! " + name + " иштебей калды.";
                }
            }
            return name + " иштетилди!";
        } else {
            return name + " өчүрүлдү!";
        }
    }

    @Override
    public String toString() {
        return "Техника: " + name + ", Бренд: " + brand + ", Версия: " + version;
    }

}
