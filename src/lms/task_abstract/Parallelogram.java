package lms.task_abstract;

public class Parallelogram extends Shape{

    public Parallelogram() {
    }

    public Parallelogram(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    @Override
    public double getPerimeter() {
        System.out.println("2 * (a() + b())");
        return 2 * (a() + b());
    }

    @Override
    public String toString() {
        return "\nParallelogram"  + super.toString();
    }
}
