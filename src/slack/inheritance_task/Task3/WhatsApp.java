package slack.inheritance_task.Task3;

import java.time.LocalDate;

public class WhatsApp extends Chat{
    private String whatsappFounder;
    private String whatsappFounderState;

    public WhatsApp() {
    }

    public WhatsApp(String name, boolean isNew, LocalDate dateOfIssue, String designColor,
                    String whatsappFounder, String whatsappFounderState) {
        super(name, isNew, dateOfIssue, designColor);
        this.whatsappFounder = whatsappFounder;
        this.whatsappFounderState = whatsappFounderState;
    }

    public String whatsappFounder() {
        return whatsappFounder;
    }

    public void setWhatsappFounder(String whatsappFounder) {
        this.whatsappFounder = whatsappFounder;
    }

    public String whatsappFounderState() {
        return whatsappFounderState;
    }

    public void setWhatsappFounderState(String whatsappFounderState) {
        this.whatsappFounderState = whatsappFounderState;
    }

    @Override
    public String getChatName() {
        return super.getChatName();
    }

    @Override
    public boolean getIsNewChat() {
        return super.getIsNewChat();
    }

    public String buyerWhatsApp(String buyerName, String price) {
        System.out.println("Buyer name: " + buyerName);
        System.out.println("price: " + price);
        return price;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nwhatsapp Founder = " + whatsappFounder +
                "\nwhatsapp Founder State = " + whatsappFounderState;
    }
}
