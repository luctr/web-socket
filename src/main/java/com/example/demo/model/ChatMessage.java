package com.example.demo.model;

import java.awt.*;
import java.util.Objects;

public class ChatMessage {
    private MessageType type;
    private String content;
    private String sender;

    public ChatMessage() {
    }

    public enum MessageType{
        CHAT,JOIN,LEAVE
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
