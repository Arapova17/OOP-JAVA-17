package lms.task_polymorphism;

public class AnimalMain {
    public static void main(String[] args) {

        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};

        Shark[] sharks = new Shark[animals.length];
        Turtle[] turtles = new Turtle[animals.length];
        Eagle[] eagles = new Eagle[animals.length];

        int sharkIndex = 0, turtleIndex = 0, eagleIndex = 0;

        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                Shark shark = (Shark) animal;
                shark.attack();
                sharks[sharkIndex++] = shark;
            } else if (animal instanceof Turtle) {
                Turtle turtle = (Turtle) animal;
                turtle.swim();
                turtles[turtleIndex++] = turtle;
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.fly();
                eagles[eagleIndex++] = eagle;
            }
        }
    }
}
