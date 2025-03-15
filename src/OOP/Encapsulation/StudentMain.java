package OOP.Encapsulation;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanForNum = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Write the student name: ");
        student.setName(scanner.nextLine());
        System.out.print("surname: ");
        student.setSureName(scanner.nextLine());
        System.out.print("age: ");
        student.setAge(scanForNum.nextInt());
        System.out.print("Write the count course: ");
        int counter = scanForNum.nextInt();
        String[] courses = new String[0];

        for (int i = 0; i < counter; i++) {
            courses = Arrays.copyOf(courses, courses.length + 1);
            System.out.print("Write the course name: ");
            courses[courses.length - 1] = scanner.nextLine();
        }
        student.setCourses(Arrays.toString(courses));

        System.out.println("Name: " + student.getName());
        System.out.println("Surname: " + student.getSureName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Courses: " + Arrays.toString(new String[]{student.getCourses()}));
    }
}
