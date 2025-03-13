package Slack.task3;

import java.util.Arrays;

public class Company {
    String companyName;
    String country;
    int yearOfFoundation;
    String founder;
    Group[] groups;

    public Company(String companyName, String country, int yearOfFoundation, String founder, Group[] groups) {
        this.companyName = companyName;
        this.country = country;
        this.yearOfFoundation = yearOfFoundation;
        this.founder = founder;
        this.groups = groups;
    }

    public String toString() {
        return "Slack.task3.Company: " + companyName + " (Founded: " + yearOfFoundation + ", Country: " + country + ", Founder: " + founder + ")\nGroups: " + Arrays.toString(groups);
    }
}
