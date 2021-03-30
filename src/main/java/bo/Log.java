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
public class Log {
    private int userId;
    private String title, message;
    private final Date dateCreated;

    public Log(int userId, String title, String message) {
        this.userId = userId;
        this.title = title;
        this.message = message;
        dateCreated = new Date();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public Date getDate(){
        return dateCreated;
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
        return "Log{" + "title=" + title + ", message=" + message + '}';
    }
    
    
}
