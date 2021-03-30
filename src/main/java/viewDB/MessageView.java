/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewDB;

import java.util.Date;

/**
 *
 * @author rami_
 */
public class MessageView {
    

    private Date dateSent;
    private String title;
    private String text;
    private String senderEmail;
    private String receiverEmail;

    public MessageView(Date dateSent, String title, String text, String senderEmail, String receiverEmail) {
        this.dateSent = dateSent;
        this.title = title;
        this.text = text;
        this.senderEmail = senderEmail;
        this.receiverEmail = receiverEmail;
    }

    public MessageView() {
    }

    public Date getDateSent() {
        return dateSent;
    }

    public void setDateSent(Date dateSent) {
        this.dateSent = dateSent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getReceiverEmail() {
        return receiverEmail;
    }

    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }

  
  
    
}
