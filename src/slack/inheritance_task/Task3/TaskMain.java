package slack.inheritance_task.Task3;

import java.time.LocalDate;

public class TaskMain {
    public static void main(String[] args) {

        Instagram instagram = new Instagram("Instagram",  false,
                LocalDate.of(2010, 10, 6) , "gradient effect",
                "Kevin Systrom, Mike Krieger", "USA, San - Fransisco");
        instagram.getChatName();
        System.out.println(instagram);
        instagram.buyer("Meta (FaceBook)", "1 миллиард доллар");

        Slack slack = new Slack("slack", true, LocalDate.of(2013, 9, 14),
                "Primary Purple", "Stewart Butterfield", "Canada, Vancouver");
        slack.getChatName();
        System.out.println(slack);
        slack.buyerSlack("company Salesforce", "27.7 миллиард доллар");

        Telegram telegram = new Telegram("Telegram", true,
                LocalDate.of(2013, 9, 14), "Blue",
                "Pavel Durov", "Russia");
        telegram.getChatName();
        System.out.println(telegram);
        telegram.buyerTelegram("Not", "Not");

        WhatsApp whatsApp = new WhatsApp("WhatsApp", false, LocalDate.of(2009, 1, 3),
                "Green", "Jan Koum, Brian Acton", "USA");
        whatsApp.getChatName();
        System.out.println(whatsApp);
        whatsApp.buyerWhatsApp("Facebook", "$19 миллиар");

        Chat[] chats = new Chat[]{instagram, slack, telegram, whatsApp};

        isNewChat(chats);
    }

    public static void isNewChat(Chat[] chats) {
        if (chats.length == 0) return;

        Chat newestChat = chats[0];

        for (Chat chat : chats) {
            if (chat.dateOfIssue().isAfter(newestChat.dateOfIssue())) {
                newestChat = chat;
            }
        }

        System.out.println("\nIs new chat: " + newestChat.name());
    }

}
