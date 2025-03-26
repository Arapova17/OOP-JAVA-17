package lms.task_abstract;

public abstract class Shape {

    private int a;
    private int b;
    private int c;
    private int d;

    public Shape() {
    }

    public Shape(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int a() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int b() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int c() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int d() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return
                "\na = " + a +
                "\nb = " + b +
                "\nc = " + c +
                "\nd = " + d ;
    }
}
