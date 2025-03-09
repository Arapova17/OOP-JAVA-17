package LMS.TaskIncapsulition;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private char gender;

    public String firstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String lastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char gender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person[] createPerson (Person[] persons, Person person){
        Person[] newPerson = new Person[persons.length + 1];

        int i = 0;
        while (i < persons.length){
            newPerson[i] = persons[i];
            i++;
        }

        newPerson[persons.length] = person;
        return newPerson;
    }

    @Override
    public String toString() {
        return "\nPerson" +
                "\nfirst Name = " + firstName +
                "last Name = " + lastName +
                "\nage = " + age +
                "\ngender = " + gender + "\n------------";
    }
}
