package Slack.CRUDtask;

import java.util.Arrays;

public class HouseMain {
    public static void main(String[] args) {

        House[] houses = new House[0];

        House house = new House();

        House house1 = new House();
        house1.setId(1);
        house1.setAddress("№1");
        house1.setPrice(100000);
        house1.setRoom(3);
        house1.setCountry("London");

        House house2 = new House();
        house2.setId(2);
        house2.setAddress("№2");
        house2.setPrice(200000);
        house2.setRoom(4);
        house2.setCountry("Paris");

        houses = house.createHouse(houses, house1);
        houses = house.createHouse(houses, house2);

        System.out.println("\nHouses:");
        System.out.println(Arrays.toString(houses));

        long searchId = 2;
        House foundHouse = house.getById(searchId, houses);
        if (foundHouse != null){
            System.out.println("\nHouse -> ID = " + searchId + ":" + foundHouse);
        }else {
            System.out.println("\n not House");
        }

        House updateHouse = new House();
        updateHouse.setAddress("№3");
        updateHouse.setPrice(300000);
        updateHouse.setRoom(5);
        updateHouse.setCountry("America");

        houses = house.updateHouseById(2, houses, updateHouse);
        System.out.println("\nNew House");
        System.out.println(Arrays.toString(houses));

        long deleteId = 1;
        houses = house.deleteHouseById(deleteId, houses);
        System.out.println("\ndelete -> " + deleteId + " - ID House:");
        System.out.println(Arrays.toString(houses));

    }
}
