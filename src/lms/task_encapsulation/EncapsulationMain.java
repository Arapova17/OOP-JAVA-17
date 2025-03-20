package lms.task_encapsulation;

import java.util.Arrays;

public class EncapsulationMain {
    public static void main(String[] args) {

        University[] universities;
        universities = new University[0];
        University university = new University();
        university.setName("КГМА");
        university.setFaculty("Стоматолог");
        university.setContract(57000);

        University university1;
        university1 = new University();
        university1.setName("КГУ");
        university1.setFaculty("Физ - мат");
        university1.setContract(47000);


        universities = university.createUniversity(universities, university);
        universities = university1.createUniversity(universities, university1);
        System.out.println(Arrays.toString(universities));

        School[] schools = new School[0];
        School school = new School();
        school.setName("Элчибек Эркебаев");
        school.setLanguage("кыргыз");
        school.setNumberOfStudents(365);
        school.setNumberOfTeachers(18);

        schools = school.createSchool(schools, school);
        System.out.println(Arrays.toString(schools));

        Person[] persons = new Person[0];
        Person person = new Person();
        person.setFirstName("Elnura");
        person.setLastName("Arapova");
        person.setAge(20);
        person.setGender('F');

        persons = person.createPerson(persons, person);
        System.out.println(Arrays.toString(persons));

        Car[] cars = new Car[0];
        Car car = new Car();
        car.setMarca("Nexia");
        car.setLight("Black");
        car.setPrice(10000);
        car.setBox("Mechanic");

        cars = car.createCar(cars, car);
        System.out.println(Arrays.toString(cars));


    }
}
