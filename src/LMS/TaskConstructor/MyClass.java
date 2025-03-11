package LMS.TaskConstructor;

public class MyClass {
    String firstName;
    String lastName;
    int age;
    String[] peakSoftLesson;
    String food;

    public MyClass(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public MyClass(String firstName, String lastName, int age, String[] peakSoftLesson, String food) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.peakSoftLesson = peakSoftLesson;
        this.food = food;
    }

    public void informationInfo() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        if (peakSoftLesson != null){
            System.out.println("PeakSoft lessons: " );
            for (String lessons : peakSoftLesson) {
                System.out.println(lessons + " ");
            }
            System.out.println();
        }
        if (food != null){
            System.out.println("Favorite Food: " + food);
        }
        System.out.println("______________________");
    }
}
