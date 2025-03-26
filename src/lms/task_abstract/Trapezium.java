package lms.task_abstract;

import javax.swing.*;

public class Trapezium extends Shape{
    public Trapezium() {
    }

    public Trapezium(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    @Override
    public double getPerimeter() {
        System.out.println("a() + b() + c() + d()");
        return a() + b() + c() + d();
    }

    @Override
    public String toString() {
        return "\nTrapezium " + super.toString();
    }
}
