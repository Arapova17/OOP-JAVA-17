package lms.task_abstract;

public class Rectangle extends Shape{

    public Rectangle() {
    }

    public Rectangle(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    @Override
    public double getPerimeter() {
        System.out.println("2 * (a() + b()");
        return 2 * (a() + b());
    }

    @Override
    public String toString() {
        return "\nRectangle " + super.toString();
    }
}
