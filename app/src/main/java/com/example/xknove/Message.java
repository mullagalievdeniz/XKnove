package com.example.xknove;

import java.util.Date;

public class Message {
    public String username;
    public String textMessage;
    public long messageTime;

    public Message() {}
    public Message(String username, String textMessage){
        this.username = username;
        this.textMessage = textMessage;

        this.messageTime = new Date().getTime();


    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}
