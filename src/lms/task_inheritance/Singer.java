package lms.task_inheritance;

public class Singer extends Person {
    private String bandName;

    public Singer() {
    }

    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String bandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
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

    public void singing(String singing){
        System.out.println("singing = " + singing);
    }

    public void playGitar(String playGitar){
        System.out.println("play = " + playGitar);
    }

    @Override
    public String toString() {
        return  "Singer " +
                super.toString() +
                "\nband Name = " + bandName ;
    }
}
