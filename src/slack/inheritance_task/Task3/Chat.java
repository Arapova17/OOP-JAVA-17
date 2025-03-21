package slack.inheritance_task.Task3;

import java.time.LocalDate;

public class Chat {
    private String name ;
    private boolean isNew;
    private LocalDate dateOfIssue;
    private String designColor;

    private Chat[] chats;

    public Chat() {
    }

    public Chat(String name, boolean isNew, LocalDate dateOfIssue, String designColor) {
        this.name = name;
        this.isNew = isNew;
        this.dateOfIssue = dateOfIssue;
        this.designColor = designColor;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public LocalDate dateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String designColor() {
        return designColor;
    }

    public void setDesignColor(String designColor) {
        this.designColor = designColor;
    }

    public  Chat [] chats (Chat[] chats) {
        return this.chats = chats;
    }

    public String getChatName(){
        System.out.println("\n______________\n" + name);

        return "Color: " + designColor;
    }

    int newChat = 2010;
    public boolean getIsNewChat(){
        if (newChat < dateOfIssue.getYear() ) {
            return false;
        } else {
            return true;
        }


    }

    @Override
    public String toString() {
        return "Chat" +
                "\nname = " + name +
                "\nis New = " + isNew +
                "\ndate Of Issue = " + dateOfIssue +
                "\ndesign Color = " + designColor +
                "\n~~~~~~~~~~~~~~~~~~~~~~";
    }
}
