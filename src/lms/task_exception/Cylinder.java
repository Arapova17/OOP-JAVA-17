package lms.task_exception;

public class Cylinder {
    public static double calculateArea(double radius, double height) {
        return 2 * Math.PI * radius * (height + radius);
    }

    public static double calculateVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
