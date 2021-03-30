package db;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
 import org.hibernate.mapping.Set;

@Entity(name = "User")
@Table(name = "Users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "UserID")
    private int id;
    @Column(name = "Email", unique = true, nullable = false)
    private String email;
    @Column(name = "FName")
    private String firstName;
    @Column(name = "LName")
    private String lastName;
    @Column(name = "Password")
    private String password;
    @OneToMany(mappedBy = "op", cascade=CascadeType.ALL,fetch= FetchType.LAZY)
    private List<Log> logs = new ArrayList<>();
    @OneToMany(mappedBy = "sender",cascade=CascadeType.ALL,fetch= FetchType.LAZY)
    private List<Message> msgsSent = new ArrayList<>();
    @OneToMany(mappedBy = "receiver",cascade=CascadeType.ALL,fetch= FetchType.LAZY)
    private List<Message> msgsReceived = new ArrayList<>(); 

    public List<Log> getLogs() {
        return logs;
    }

    public void setLogs(List<Log> logs) {
        this.logs = logs;
    }

    public List<Message> getMsgsSent() {
        return msgsSent;
    }

    public void setMsgsSent(List<Message> msgsSent) {
        this.msgsSent = msgsSent;
    }

    public List<Message> getMsgsReceived() {
        return msgsReceived;
    }

    public void setMsgsReceived(List<Message> msgsReceived) {
        this.msgsReceived = msgsReceived;
    }

    public User() {

    }
    @Override
    public String toString() {
        return "Email is: "+this.email+" ,name is: "+this.firstName+" ,nlast ame is: "+this.lastName; 
    }
    public User(int id, String email, String firstName, String lastName, String password) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public User(String email, String firstName, String lastName, String password) {
        super();
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public int getId() {
        return id;
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

    public void setId(int id) {
        this.id = id;
    }

}
