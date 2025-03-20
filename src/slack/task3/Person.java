package slack.task3;

public class Person {
    String firstName;
    String lastName;
    String dateOfBirth;

    public Person(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return firstName + " " + lastName + " (Born: " + dateOfBirth + ")";
    }
}
