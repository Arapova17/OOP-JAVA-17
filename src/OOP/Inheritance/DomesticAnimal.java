package OOP.Inheritance;

public class DomesticAnimal extends Animal{
    private String cormName;

    public DomesticAnimal(String name, int age) {
        super(name, age);
    }

    public String cormName() {
        return cormName;
    }

    public void setCormName(String cormName) {
        this.cormName = cormName;
    }

    @Override
    public String toString() {
        return "DomesticAnimal{" +
                super.toString() +
                " cormName =' " + cormName + '\'' +
                '}';
    }
}
