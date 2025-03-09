package Slack.task4;

import java.util.Scanner;

public class SeasonMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Айдын номерин киргизиңиз (1-12): ");
        Season season = new Season();
        season.month = scanner.nextInt();
        season.getSeasons(season.month);
    }
}
