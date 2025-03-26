package abstract_class;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

//        CarB carB = new CarB("nexia", "black", "160");
//        carB.gas();
//        carB.brake();
//        System.out.println(carB.toString());
//
//        Car carC = new CarC("kamaz", "wright", "140");
//        carC.brake();
//        carC.gas();
//        System.out.println(carC.toString());

        Device laptop = new Laptop("M1", "2");
        laptop.setId(1);
        laptop.setBrand("mi");
        laptop.setPrice(12000);
        laptop.setColor("black");
        laptop.setYearOfIssue(LocalDate.of(2013, 3, 4));
        laptop.setOperatingSystem("MacOS");

        laptop.addDevice(laptop);
    }
}
