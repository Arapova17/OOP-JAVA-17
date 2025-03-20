package slack.inheritance_task.Task3;

import java.time.LocalDate;

public class Slack extends Chat{
    private String slackFounder;
    private String slackFounderState;

    public Slack() {
    }

    public Slack(String name, boolean isNew, LocalDate dateOfIssue, String designColor,
                 String slackFounder, String slackFounderState) {
        super(name, isNew, dateOfIssue, designColor);
        this.slackFounder = slackFounder;
        this.slackFounderState = slackFounderState;
    }

    public String slackFounder() {
        return slackFounder;
    }

    public void setSlackFounder(String slackFounder) {
        this.slackFounder = slackFounder;
    }

    public String slackFounderState() {
        return slackFounderState;
    }

    public void setSlackFounderState(String slackFounderState) {
        this.slackFounderState = slackFounderState;
    }

    @Override
    public String getChatName() {
        return super.getChatName();
    }

    @Override
    public boolean getIsNewChat() {
        return super.getIsNewChat();
    }

    public String buyerSlack(String buyerName, String price){
        System.out.println("Buyer name: " + buyerName);
        System.out.println("price: " + price);
        return price;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nslack Founder = " + slackFounder +
                "\nslack Founder State = " + slackFounderState ;
    }
}
