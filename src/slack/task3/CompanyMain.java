package slack.task3;

public class CompanyMain {
    public static void main(String[] args) {

        Person p1 = new Person("John", "Doe", "1990-05-15");
        Person p2 = new Person("Jane", "Smith", "1992-08-22");
        Person p3 = new Person("Alice", "Brown", "1995-03-10");

        Group g1 = new Group("Developers", "2023-01-10", "Mr. Anderson", new Person[]{p1, p2});
        Group g2 = new Group("Designers", "2023-02-15", "Ms. Taylor", new Person[]{p3});

        Company company = new Company("Tech Innovators", "USA", 2005, "Elon Musk", new Group[]{g1, g2});

        System.out.println(company);

    }
}
