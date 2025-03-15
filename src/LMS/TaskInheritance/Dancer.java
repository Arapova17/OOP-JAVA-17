package LMS.TaskInheritance;

public class Dancer extends Person {
    private String groupName;

    public Dancer(String groupName) {
        this.groupName = groupName;
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String groupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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

    public void dancing(String dancing){
        System.out.println("dancing = " + dancing);
    }

    @Override
    public String toString() {
        return "\nDancer " +
                super.toString() +
                "\ngroupName='" + groupName;
    }
}
