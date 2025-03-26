package lms.task_abstract;

public class Main {
    public static void main(String[] args) {
        Shape parallelogram = new Parallelogram(8, 6, 8, 6);
        System.out.println(parallelogram);
        System.out.println("Perimeter = " + parallelogram.getPerimeter());

        Shape rectangle = new Rectangle(10, 4, 10, 4);
        System.out.println(rectangle);
        System.out.println("Perimeter = " + rectangle.getPerimeter());

        Shape rhombus = new Rhombus(7, 6 , 7, 6);
        System.out.println(rhombus);
        System.out.println("Perimeter = " + rhombus.getPerimeter());

        Shape square = new Square(5, 5, 5, 5);
        System.out.println(square);
        System.out.println("Perimeter = " + square.getPerimeter());

        Shape trapezium = new Trapezium(8, 4, 6, 7);
        System.out.println(trapezium);
        System.out.println("Perimeter = " + trapezium.getPerimeter());
    }
}
