package oop.encapsulation;

public class Encapsulation {
    public static void main(String[] args) {

        // TODO ENCAPSULATION
        // -> МААЛЫМАТТАРДЫ ЖАНА АЛАР МЕНЕН БОЛГОН МЕТОДДОРДУ (ФУНКЦИЯЛАРДЫ) БИРИКТИРУУ
              // PRIVATE                           GETTER AND SETTER
        // -> ОБЪЕКТТИН ИЧКИ МААЛЫМАТТАРЫ ТЫШКЫ ТААСИРДЕН КОРГОЛОТ
        // -> МИСАЛЫ

        // TODO КЛАСС ТУЗУУ
        // CLASS CAR {
        //    PRIVATE STRING BRAND;
        //    PRIVATE INT SPEED;

        // TODO КОНСТРУКТОР
        // public Car () {
        // }

        // PUBLIC CAR (STRING BRAND, INT SPEED){
        //     THIS.BRAND = BRAND;
        //     THIS.SPEED = SPEED;
        // }

        // TODO GETTER
        // PUBLIC STRING getBRAND () {
        //    return brand;
        // }

        // TODO SETTER
        // public void setBrand (String brand) {
        //      this.brand = brand;
        // }

        // public getSpeed () {
        //      return speed;

        // public void setSpeed (int speed) {
        //      if (speed > 0) {
                 // this.speed = speed;
             // }
        // }

        // TODO METHOD
        // public void accelerate () {
        //     speed += 10;
        //     System.out.println("Speed: " + speed);
         // }
        // }

        // public class Main {
        //    public static void main(String[] args) {
        //        Car car = new Car("Toyota", 100);
        //        System.out.println(car.getBrand());  // Toyota
        //        car.accelerate();  // Speed: 110
        //    }
        // }





        Hous hous = new Hous();
        hous.setAddress("lms");
        hous.setNumbersOfRooms(4);
        hous.setArea(20);
        System.out.println(hous.calculatePrice(2));
        String string = hous.toString();
        System.out.println(string);

    }
}
