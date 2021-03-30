/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewDB;

import db.User;
import java.util.Date;

/**
 *
 * @author rami_
 */
public class LogView {

    private Date dateAdded;
    private String title;

    @Override
    public String toString() {
        return "LogView{" + "dateAdded=" + dateAdded + ", title=" + title + ", text=" + text + ", opEmail=" + opEmail + '}';
    }
    private String text;
    private String opEmail;//OriginalPoster email

    public String getOpEmail() {
        return opEmail;
    }

    public void setOpEmail(String opEmail) {
        this.opEmail = opEmail;
    }

    public LogView(Date dateAdded, String title, String text, String opEmail) {
        this.dateAdded = dateAdded;
        this.title = title;
        this.text = text;
        this.opEmail = opEmail;
    }

    public LogView() {
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
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

}
