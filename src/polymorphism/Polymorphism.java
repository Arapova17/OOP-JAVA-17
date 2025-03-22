package polymorphism;

import java.util.Arrays;

public class Polymorphism {
    public static void main(String[] args) {

//        Cow[] cows = {
//                new Cow("cow1", 1, "black", "250 kg"),
//                new Cow("cow2", 2, "black", "270 kg"),
//                new Cow("cow3", 1, "black", "150 kg"),
//                new Cow("cow4", 3, "black", "300 kg"),
//                new Cow("cow5", 2, "black", "200 kg")};
//
//        Sheep[] sheep = {
//                new Sheep("sheep1", 1, "wright", "70"),
//                new Sheep("sheep2", 2, "wright", "75"),
//                new Sheep("sheep3", 3, "wright", "85")};
//
//        Horse[] horses = {
//                new Horse(),
//                new Horse("horse2", 2, "black", "350 kg")};
//
//        Farm farm = new Farm("farm1", cows, horses, sheep, "FARM");
//        Farm farm1 = new Farm();
//        farm1.address = "farm2";
//        farm1.cows = new Cow[]{new Cow("cow1", 1, "black", "250 kg")};
//        farm1.horses = new Horse[]{new Horse("horse1", 1, "black", "350 kg")};
//        farm1.sheep = new Sheep[]{new Sheep("sheep1", 1, "wright", "70")};
//        farm1.ownerName = "FARM1";
//
//        System.out.println(farm);
//        System.out.println(farm1);

        Sport football = new Football("real madrid", "prof", 11);
        Sport swim = new Swimming("swimers", "lover", 2);
        Sport basketball = new Basketball("lakers", "prof", 10);
        Sport[] sports = {football, swim, basketball};

        System.out.println(Arrays.toString(sports));
        Sport sport = new Sport();
        System.out.println(Arrays.toString(sport.getSports(sports)));


    }
}
