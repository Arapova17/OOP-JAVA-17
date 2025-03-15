package OOP.Inheritance;

import Slack.InheritanceTask.Mother;

public class Daughter extends Mother {
    private String hairColor;
    private int heigh;

    public Daughter(String name, int age, String eyeColor, String hairColor, int heigh) {
        super(name, age, eyeColor);
        this.hairColor = hairColor;
        this.heigh = heigh;
    }

    public String hairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int heigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    @Override
    public String getName() {
        return name()+ "this is dougther";
    }

    @Override
    public String toString() {
        return "Daughter" +
                "\nhair Color = " + hairColor +
                "\nheigh = " + heigh ;
    }
}
