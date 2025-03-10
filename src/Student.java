public class Student {
    private String name;
    private String sureName;
    private int age;

    public Student(String name, String sureName, int age) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSureName(){
        return sureName;
    }

    public void setSureName(String sureName){
        this.sureName = sureName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }
    }

    private boolean checkAge(int age){
        if (age < 0){
            System.out.println("Invalid age");
        }

        return true;
    }
}
