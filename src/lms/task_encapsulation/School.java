package lms.task_encapsulation;

public class School {
    private String name;
    private String language;
    private int numberOfStudents;
    private int numberOfTeachers;

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String language() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int numberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public int numberOfTeachers() {
        return numberOfTeachers;
    }

    public void setNumberOfTeachers(int numberOfTeachers) {
        this.numberOfTeachers = numberOfTeachers;
    }

    public School[] createSchool (School[] schools, School school){
        School[] newSchool = new School[schools.length + 1];

        for (int i = 0; i < schools.length; i++) {
            newSchool[i] = schools[i];
        }
        newSchool[schools.length] = school;
        return newSchool;
    }

    @Override
    public String toString() {
        return "\nSchool" +
                "\nname = " + name +
                "\nlanguage = " + language +
                "\nnumber Of Students = " + numberOfStudents +
                "\nnumber Of Teachers = " + numberOfTeachers + "\n------------";
    }
}
