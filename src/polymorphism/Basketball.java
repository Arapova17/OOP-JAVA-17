package polymorphism;

public class Basketball extends Sport{

    public Basketball() {
    }

    public Basketball(String teamName, String category, int players) {
        super(teamName, category, players);
    }

    public void throwBall(){
        System.out.println("throw Ball");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
