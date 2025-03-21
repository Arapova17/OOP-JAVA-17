package slack.inheritance_task.Task4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4Main {
    public static void main(String[] args) {

        Apartment apartment = new Apartment();
        apartment.setTitle("Datka");
        apartment.setAddress("Малдыбаева 6/1");
        apartment.setPrice(12000);
        System.out.println(apartment);

        Apartment apartment1 = new Apartment("Kut", 15000,  "Шопокова 53");
        System.out.println(apartment1);

        System.out.println("\nWrite apartment; ");

        Student student = new Student();
        Student student0 = new Student("Ayana", "+996 501", "Малдыбаева 6/1", 6000);
        Student student1 = new Student("Anara", "+996 502", "Малдыбаева 6/1", 5000);
        Student student2 = new Student("Akyl", "+996 503", "Малдыбаева 6/1", 8000);

        Student student3 = new Student("Ali", "+996 504", "Kut", 5000);
        Student student4 = new Student("Ariet", "+996 505", "Kut", 6000);
        Student student5 = new Student("Ainur", "+996 506", "Kut", 9000);


        Student[] students = new Student[]{student0, student1, student2};
        Student[] students1 = new Student[]{student3, student4, student5};

        apartmentStudent(apartment, apartment1,student, students, students1);

    }

    public static void apartmentStudent(Apartment apartment, Apartment apartment1, Student student0,
                                        Student[] students, Student[] student){
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()){
            case "Datka":
                System.out.println(Arrays.toString(students));
                System.out.println(apartment.payperMonth(students));
                student0.living(apartment, students);

                break;

            case "Kut":
                System.out.println(Arrays.toString(student));
                System.out.println(apartment1.payperMonth(student));
                student0.living(apartment1, student);
                break;
        }
    }
}
