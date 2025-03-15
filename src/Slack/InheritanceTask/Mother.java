package Slack.InheritanceTask;

public class Mother {
    private String name;
    private int age;
    private String eyeColor;

    public Mother(String name, int age, String eyeColor) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String eyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getName(){
        return this.name + " this is mother";
    }

//    @Override
//    public String toString() {
//        return "Mother" +
//                "\nname = " + name +
//                "\nage = " + age +
//                "\neye Color = " + eyeColor ;
//    }
}
