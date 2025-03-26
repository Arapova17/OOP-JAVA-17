package slack.polymorphism_task3;

import java.util.Scanner;

public class Notes extends MyPhone{
    private String MyHistory;


    public Notes(Scanner scanner) {
        MyHistory = scanner.nextLine();
    }

    public Notes(String model, int memory, String myHistory) {
        super(model, memory);
        MyHistory = myHistory;
    }

    public String MyHistory() {
        return MyHistory;
    }

    public void setMyHistory(String myHistory) {
        MyHistory = myHistory;
    }

    @Override
    public String toString() {
        return "\nNotes" +
                "\nMy History = " + MyHistory ;
    }
}
