package OOP.Inheritance;

public class Cat extends DomesticAnimal {
    private String color;

    public Cat(String name, int age) {
        super(name, age);
    }

    public String color() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    public void showInfo(){
//        System.out.println("Cat: ");
//        System.out.println("name = " + name());
//        System.out.println("age = " + age());
//    }


    @Override
    public void basuu() {
        super.basuu();
    }

    @Override
    public void unVhygaruu() {
        System.out.println("mauv");
    }

    @Override
    public String toString() {
        return "Cat{ " +
                super.toString() +
                " color='" + color + '\'' +
                '}';
    }
}
