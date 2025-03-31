package enum_lesson;

public class Person {
    private String name;
    private Language language;

    public Person() {
    }

    public Person(String name, Language language) {
        this.name = name;
        this.language = language;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language language() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
