import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

//        Student student = new Student("Ayan", "Arapova", 12);
//        System.out.println(student.getName());
//        System.out.println(student.getSureName());
//        System.out.println(student.getAge());

//        Rectangle rectangle = new Rectangle(2, 4, 2, 4);
//        System.out.println(rectangle.getA());
//        System.out.println(rectangle.getB());
//        System.out.println(rectangle.getC());
//        System.out.println(rectangle.getD());

        Scanner scanner = new Scanner(System.in);
        Students students = new Students();
        System.out.print("Write the student name; ");
        students.setName(scanner.nextLine());
        System.out.print("Sure Name; ");
        students.setSureName(scanner.nextLine());
        System.out.print("age; ");
        students.setAge(new Scanner(System.in).nextInt());
        System.out.print("Write the count course; ");
        int counter = scanner.nextInt();
        String[] courses = new  String[0];

        for (int i = 0; i < counter; i++) {
            courses = Arra
        }
   }
}