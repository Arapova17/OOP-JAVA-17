import java.util.Arrays;
import java.util.Scanner;

public class Students {
    private String name;
    private String sureName;
    private int age;
    private String[] courses;
    
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name =name;
    }

    public String getSureName(){
        return sureName;
    }

    public void setSureName(String sureName){
        this.sureName = sureName;
    }

    public int getAge (){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String[] getCourses(){
        return courses;
    }

    public void setCourses(String[] courses){
        this.courses = courses;
    }
}
