package polymorphism;

public class Football extends Sport{

    public Football() {
    }

    public Football(String teamName, String category, int players) {
        super(teamName, category, players);
    }

    public void getFootball(){
        System.out.println("kick Ball");
    }

    @Override
    public String toString() {
        return "Football " + super.toString();
    }
}
