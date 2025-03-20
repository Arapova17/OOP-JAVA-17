package oop.polymorphism;

public class Polymorphism {
    public static void main(String[] args) {

        // TODO POLYMORPHISM
        // Бир эле метод ар кандай класстарда ар кандайча ишке ашырылат.
        // Полиморфизм эки түрдүү болот:
        // 1️⃣ Методду кайра аныктоо (TODO Method Overriding)
        // 2️⃣ Методду кайра жүктөө (TODO Method Overloading)

        // 1. Методду кайра аныктоо (TODO Overriding)
        // Мисал:
        // TODO CLASS
        // class Bird {
        //    void sound() {
        //        System.out.println("Chirp");
        //    }
        // }

        // TODO EXTENDS
        // class Cat extends Bird {
        //    void sound() {
        //        System.out.println("Meow");
        //    }
        // }

        // TODO MAIN
        // public class Main {
        //    public static void main(String[] args) {
        //        Bird myBird = new Cat();
        //        myBird.sound();  // Meow
        //    }
        // }

        // 2. Методду кайра жүктөө (Overloading)
        // TODO Методдун аталышы бирдей, бирок параметрлери ар кандай болушу мүмкүн.
        // TODO CLASS
        // class MathOperations {
        //    int add(int a, int b) {
        //        return a + b;
        //    }
        //
        //    double add(double a, double b) {
        //        return a + b;
        //    }
        // }
        //
        // public class Main {
        //    public static void main(String[] args) {
        //        MathOperations math = new MathOperations();
        //        System.out.println(math.add(5, 10));        // 15
        //        System.out.println(math.add(5.5, 10.5));    // 16.0
        //    }
        // }
    }
}
