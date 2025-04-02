package lms.task_exception;

public class Parallelepiped {
    public static double calculateArea(double length, double width, double height) {
        return 2 * ((height * length) + (length * width) + (height * width));
    }

    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
}
