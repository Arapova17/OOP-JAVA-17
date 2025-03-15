package LMS.TaskInheritance;

public class PersonMain {
    public static void main(String[] args) {

        Singer singer = new Singer("Ayana", "Sing", "Echo");
        System.out.println(singer);
        singer.learn("Gitar");
        singer.walk("Music room");
        singer.eat("egg");
        singer.singing("Titanic");
        singer.playGitar("play piano");

        Dancer dancer = new Dancer("Anna", "Dance", "Aurora");
        System.out.println(dancer);
        dancer.learn("to dance");
        dancer.walk("Dance studio");
        dancer.eat("salad");
        dancer.dancing("flash mob");

        Programmer programmer = new Programmer("Elnura", "IT", "JAVA 17");
        System.out.println(programmer);
        programmer.learn("Laptop");
        programmer.walk("PeakSoft House");
        programmer.eat("Coffee and tea");
        programmer.coding("Java");


    }
}
