package Slack.task4;

public class Season {
    int month;

    public void getSeasons(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Summer");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Spring");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
        }
    }
}
