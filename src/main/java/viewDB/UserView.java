/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewDB;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rami_
 */
public class UserView {

    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private List<LogView> logs;
    private List<MessageView> msgsSent;
    private List<MessageView> msgsReceived;

    public List<LogView> getLogViews() {
        return logs;
    }

    public void setLogViews(List<LogView> logs) {
        this.logs = logs;
    }

    public List<MessageView> getMsgsSent() {
        return msgsSent;
    }

    public void setMsgsSent(List<MessageView> msgsSent) {
        this.msgsSent = msgsSent;
    }

    public List<MessageView> getMsgsReceived() {
        return msgsReceived;
    }

    public void setMsgsReceived(List<MessageView> msgsReceived) {
        this.msgsReceived = msgsReceived;
    }

    public UserView() {

    }

    public UserView(String email, String firstName, String lastName, String password) {
        super();
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }
    public UserView(String email, String firstName, String lastName) {
        super();
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Email is: " + this.email + " ,name is: " + this.firstName + " ,nlast ame is: " + this.lastName;
    }
}
