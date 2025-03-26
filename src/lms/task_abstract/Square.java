package lms.task_abstract;

public class Square extends Shape{
    public Square() {
    }

    public Square(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    @Override
    public double getPerimeter() {
        System.out.println("4 * a()");
        return 4 * a();
    }

    @Override
    public String toString() {
        return "\nSquare " + super.toString();
    }
}
