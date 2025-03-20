package lms.task_inheritance;

public class Programmer extends Person{
    private String companyName;

    public Programmer(String companyName) {
        this.companyName = companyName;
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String companyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void learn(String learn) {
        super.learn(learn);
    }

    @Override
    public void walk(String walk) {
        super.walk(walk);
    }

    @Override
    public void eat(String eat) {
        super.eat(eat);
    }

    public void coding(String coding){
        System.out.println("coding = " + coding);
    }

    @Override
    public String toString() {
        return "\nProgrammer " +
                super.toString() +
                "\ncompanyName = " + companyName;
    }
}
