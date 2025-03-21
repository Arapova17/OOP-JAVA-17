package lms.task_modifiers;

public class Circle {
   static double PI;
    static double radius;

    public static double PI() {
        return PI;
    }

    public static void setPI(double PI) {
        Circle.PI = PI;
    }

    public static double radius() {
        return radius;
    }

    public static void setRadius(double radius) {
        Circle.radius = radius;
    }

    static void area(){
        double area = PI * (radius * radius);
        System.out.println("area = " + area);
    }

    static void circumference(){
        double circumference = PI * 2 * radius;
        System.out.println("circumference = " + circumference);
    }
}
