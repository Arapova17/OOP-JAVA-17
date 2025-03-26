package lms.task_abstract;

public class Rhombus extends Shape{
    public Rhombus() {
    }

    public Rhombus(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    @Override
    public double getPerimeter() {
        System.out.println("4 * a()");
        return 4 * a();
    }

    @Override
    public String toString() {
        return "\nRhombus " + super.toString();
    }
}
