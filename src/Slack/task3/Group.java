package Slack.task3;

import java.util.Arrays;

public class Group {
    String groupName;
    String startDate;
    String mentor;
    Person[] people;

    public Group(String groupName, String startDate, String mentor, Person[] people) {
        this.groupName = groupName;
        this.startDate = startDate;
        this.mentor = mentor;
        this.people = people;
    }

    public String toString() {
        return "Slack.task3.Group: " + groupName + " (Start: " + startDate + ", Mentor: " + mentor + ")\nMembers: " +
                Arrays.toString(people);
    }
}
