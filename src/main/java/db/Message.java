/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author rami_
 */
@Entity(name = "Message")
@Table(name = "Messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MesseageID")
    private int Id;

    public Message(Date dateSent, String title, String text, User sender, User receiver) {
        this.dateSent = dateSent;
        this.title = title;
        this.text = text;
        this.sender = sender;
        this.receiver = receiver;
    }
    @Column
    private Date dateSent;
    @Column
    private String title;
    @Column
    private String text;
    @ManyToOne
    @JoinColumn(name = "UserID", insertable = false, updatable = false)
    private User sender;
    @ManyToOne
    @JoinColumn(name = "UserID", insertable = false, updatable = false)
    private User receiver;

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public Message() {
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the dateSent
     */
    public Date getDateSent() {
        return dateSent;
    }

    /**
     * @param dateSent the dateSent to set
     */
    public void setDateSent(Date dateSent) {
        this.dateSent = dateSent;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

}
