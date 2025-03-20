package oop.inheritance;

public class Dog extends Animal {
    private String proda;

    public Dog(String name, int age, String proda) {
        super(name, age);
        this.proda = proda;
    }

    public String proda() {
        return proda;
    }

    public void setProda(String proda) {
        this.proda = proda;
    }

//    @Override
//    public void showInfo() {
//        System.out.println("Dog: ");
//        System.out.println("name = " + name());
//        System.out.println("age = " + age());
//    }


    @Override
    public void basuu() {
        super.basuu();
    }

    @Override
    public void unVhygaruu() {
        System.out.println("vav");
    }

    @Override
    public String toString() {
        return "Dog{" +
                super.toString() +
                " proda =' " + proda + '\'' +
                '}';
    }
}
