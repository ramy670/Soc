/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import java.util.Date;

/**
 *
 * @author Jonny
 */
public class Message {
    private String receiverId, senderId, title, message;
    private final Date dateCreated;

    public Message(String receiverId, String senderId, String title, String message) {
        this.receiverId = receiverId;
        this.senderId = senderId;
        this.title = title;
        this.message = message;
        this.dateCreated = new Date();
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" + "receiverId=" + receiverId + ", senderId=" + senderId + ", title=" + title + ", message=" + message + ", dateCreated=" + dateCreated + '}';
    }
}