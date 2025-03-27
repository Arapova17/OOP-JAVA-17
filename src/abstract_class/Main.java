package abstract_class;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        CarB carB = new CarB("kia", "black", "160");
//        carB.gas();
//        carB.brake();
//        System.out.println(carB.toString());
//
//        Car carC = new CarC("porter", "wright", "140");
//        carC.brake();
//        carC.gas();
//        System.out.println(carC.toString());

//        Device laptop = new Laptop(1, "MI", 12000, "Windows", "Black",
//                LocalDate.of(2020, 2, 2), "M1", "8");
//
//        laptop.addDevice(laptop);
//        System.out.println("All device " + Arrays.toString(laptop.getAllDevice()));
//        System.out.println();
//        System.out.println(laptop.getById(1));
//        System.out.println();
//
//        laptop.updateDevice(1, new Laptop(1, "Samsung", 15000, "Windows", "Blue",
//                LocalDate.of(2023, 3, 2), "M2", "6"));
//        System.out.println("Update device " + Arrays.toString(laptop.getAllDevice()));
//
//        System.out.println();
//        laptop.deleteDevice(1);
//        System.out.println("Delete device " + Arrays.toString(laptop.getAllDevice()));

        Device phone = new Phone(1, "MI", 13000, "Android 10", "Black",
                LocalDate.of(2022, 3, 29), "8 Mp", false);
        Device phone1 = new Phone(2, "Redmi", 15000, "Android 9", "Blue",
                LocalDate.of(2023, 5, 9), "13 Mp", true);

        phone.addDevice(phone);
        phone.addDevice(phone1);
        System.out.println("All device " + Arrays.toString(phone.getAllDevice()));
//        System.out.println("\n" + phone.getById(1));

        phone.updateDevice(1, new Phone(1, "Honor", 14000, "Android", "red",
                LocalDate.of(2021, 10, 10), "9 Mp", false));
//        System.out.println("Update device " + Arrays.toString(phone.getAllDevice()));

        phone.deleteDevice(1);
        System.out.println("Delete device " + Arrays.toString(phone.getAllDevice()));




    }
}
