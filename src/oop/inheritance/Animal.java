package oop.inheritance;

public class Animal {
    private String name;
    private  int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public void showInfo(){
//        System.out.println("Animal: ");
//        System.out.println("name = " + name);
//        System.out.println("age = " + age);
//    }

    public void basuu(){
        System.out.println("basuu");
    }

    public void unVhygaruu(){
        System.out.println("un chugaruu");
    }

    @Override
    public String toString() {
        return "Animal" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
