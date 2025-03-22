package polymorphism;

import java.util.Scanner;

public class Sport {
    private String teamName;
    private String category;
    private int players;

    public Sport() {

    }

    public Sport(String teamName, String category, int players) {
        this.teamName = teamName;
        this.category = category;
        this.players = players;
    }

    public String teamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String category() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int players() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public Sport[] getSports (Sport[] sports){
        Sport[] result = new Sport[10];
        int count = 0;
        for (Sport sport : sports){
            if (sport.category.equals("prof")){
                result[count] = sport;
                count++;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "\nSport" +
                "\nteam Name = " + teamName +
                "\ncategory = " + category +
                "\nplayers = " + players ;
    }
}
