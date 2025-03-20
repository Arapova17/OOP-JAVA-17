package lms.task_oop;

public class Triangle {
    byte a;
    byte b;
    byte c;

    public double area() {
        int P;

        System.out.print("P = " + "(" + a + " + " + b + " + " + c + ")" + " / " + "2 = ");
        System.out.println(P = (a + b + c) / 2);
        double S = Math.sqrt(P * (P - a) * (P - b) * (P - c));
        System.out.printf("""
                        S = %d * (%d - %d) * (%d - %d) * (%d - %d) = %.1f""",
                P, P, a, P, b, P, c, S);
        return 0;
    }
}
