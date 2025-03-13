package Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {

        Hous hous = new Hous();
        hous.setAddress("LMS");
        hous.setNumbersOfRooms(4);
        hous.setArea(20);
        System.out.println(hous.calculatePrice(2));
        String string = hous.toString();
        System.out.println(string);

    }
}
