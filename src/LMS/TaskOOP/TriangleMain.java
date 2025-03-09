package LMS.TaskOOP;

import java.util.Scanner;

public class TriangleMain {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        System.out.println("Үч бурчтуктун аянтын табуу");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        System.out.println(triangle.a = scanner.nextByte());
        System.out.print("b = ");
        System.out.println(triangle.b = scanner.nextByte());
        System.out.print("c = ");
        System.out.println(triangle.c = scanner.nextByte());

        System.out.println(triangle.area());

    }
}