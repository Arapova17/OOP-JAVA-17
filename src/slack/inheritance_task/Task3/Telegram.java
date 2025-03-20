package slack.inheritance_task.Task3;

import java.time.LocalDate;

public class Telegram extends Chat{
    private String telegramFounder;
    private String telegramFounderState;

    public Telegram() {
    }

    public Telegram(String name, boolean isNew, LocalDate dateOfIssue, String designColor,
                    String telegramFounder, String telegramFounderState) {
        super(name, isNew, dateOfIssue, designColor);
        this.telegramFounder = telegramFounder;
        this.telegramFounderState = telegramFounderState;
    }

    public String telegramFounder() {
        return telegramFounder;
    }

    public void setTelegramFounder(String telegramFounder) {
        this.telegramFounder = telegramFounder;
    }

    public String telegramFounderState() {
        return telegramFounderState;
    }

    public void setTelegramFounderState(String telegramFounderState) {
        this.telegramFounderState = telegramFounderState;
    }

    @Override
    public String getChatName() {
        return super.getChatName();
    }

    @Override
    public boolean getIsNewChat() {
        return super.getIsNewChat();
    }

    public String buyerTelegram(String buyerName, String price) {
        System.out.println("Buyer name: " + buyerName);
        System.out.println("price: " + price);
        return price;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ntelegram Founder = " + telegramFounder +
                "\ntelegram Founder State = " + telegramFounderState ;
    }
}
