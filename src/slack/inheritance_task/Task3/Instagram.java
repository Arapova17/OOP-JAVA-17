package slack.inheritance_task.Task3;

import java.time.LocalDate;

public class Instagram extends Chat{
    private String instagramFounder;
    private String instagramFounderState;

    public Instagram() {
    }

    public Instagram(String name, boolean isNew, LocalDate dateOfIssue, String designColor,
                     String instagramFounder, String instagramFounderState) {
        super(name, isNew, dateOfIssue, designColor);
        this.instagramFounder = instagramFounder;
        this.instagramFounderState = instagramFounderState;
    }

    public String instagramFounder() {
        return instagramFounder;
    }

    public void setInstagramFounder(String instagramFounder) {
        this.instagramFounder = instagramFounder;
    }

    public String instagramFounderState() {
        return instagramFounderState;
    }

    public void setInstagramFounderState(String instagramFounderState) {
        this.instagramFounderState = instagramFounderState;
    }

    @Override
    public String getChatName() {
        return super.getChatName();
    }

    @Override
    public boolean getIsNewChat() {
        return super.getIsNewChat();
    }

    public String buyer (String buyerName, String price){
        System.out.println("Buyer name: " + buyerName);
        System.out.println("price: " + price);
        return "";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ninstagram Founder = " + instagramFounder +
                "\ninstagram Founder State = " + instagramFounderState ;
    }
}
