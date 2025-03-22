package polymorphism;

public class Swimming extends Sport{

    public Swimming() {
    }

    public Swimming(String teamName, String category, int players) {
        super(teamName, category, players);
    }

    public void swim(){
        System.out.println("swim");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
