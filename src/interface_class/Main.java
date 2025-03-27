package interface_class;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        FlyAble flyAble = new Bird();
//        flyAble.fly();

        SwimAble shark = new Shark();
        SwimAble shark1 = new Shark();
        SwimAble shark2 = new Shark();
        SwimAble shark3 = new Shark();
        SwimAble shark4 = new Shark();

        SwimAble turtle = new Turtle();
        SwimAble turtle1 = new Turtle();
        SwimAble turtle2 = new Turtle();
        SwimAble turtle3 = new Turtle();
        SwimAble turtle4 = new Turtle();

        SwimAble duck = new Duck();
        SwimAble duck1 = new Duck();
        SwimAble duck2 = new Duck();
        SwimAble duck3 = new Duck();
        SwimAble duck4 = new Duck();

        SwimAble[] ocean = new SwimAble[]{shark, shark1, shark2, shark3, shark4, turtle, turtle1, turtle2,
        turtle3, turtle4, duck, duck1, duck2, duck3, duck4};
        for (SwimAble oceans : ocean){
            oceans.swim();
        }
    }
}
