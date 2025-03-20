package modifier.task;

public class Country {
    String name;
    String people;
    double s;
    String language;

    public Country(String name, String people, double s, String language) {
        this.name = name;
        this.people = people;
        this.s = s;
        this.language = language;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String people() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public double s() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public String language() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "\nCountry" +
                "\nname = " + name +
                "\npeople = " + people +
                "\ns = " + s +
                "\nlanguage = " + language ;
    }
}
