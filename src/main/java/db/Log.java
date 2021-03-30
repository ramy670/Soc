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
@Entity(name = "Log")
@Table(name = "Logs")
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LogID")
    private int Id;
    @Column
    private Date dateAdded;
    @Column
    private String title;
    @Column
    private String text;
    @ManyToOne 
    @JoinColumn(name = "UserID")
    private User op;

    @Override
    public String toString() {
        return "Log{" + "Id=" + Id + ", dateAdded=" + dateAdded + ", title=" + title + ", text=" + text + ", op=" + op + '}';
    }

    public Log(Date dateAdded, String title, String text, User op) {
        this.dateAdded = dateAdded;
        this.title = title;
        this.text = text;
        this.op = op;
    }

    public Log() {
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
     * @return the dateAdded
     */
    public Date getDateAdded() {
        return dateAdded;
    }

    /**
     * @param dateAdded the dateAdded to set
     */
    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
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

    public User getOp() {
        return op;
    }

    public void setOp(User op) {
        this.op = op;
    }

}
