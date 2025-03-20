package lms.task_constructor;

public class MyClassMain {
    public static void main(String[] args) {

        // LMS.TaskConstructor.MyClass

        MyClass myClass = new MyClass("Elnura", "Arapova", 20);
        String[] lessons = {"Java Technical", "Java Practice", "Technical English"};

        MyClass myClass1 = new MyClass("Elnura", "Arapova", 20, lessons, "Sushi");
        myClass.informationInfo();
        myClass1.informationInfo();
    }
}
