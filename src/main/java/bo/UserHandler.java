/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import db.Message;
import db.User;
import db.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import viewDB.LogView;
import viewDB.MessageView;
import viewDB.TrimmedUserView;
import viewDB.UserView;

/**
 *
 * @author rami_
 */
@ManagedBean(name = "userHandler", eager = true)
@SessionScoped
public class UserHandler {

    //@Transactional??
    public boolean addUser(UserView newUser) {
        EntityManager em = MyEntityManagerFactory.getEntityManager();
        User usr = new User(newUser.getEmail(), newUser.getFirstName(), newUser.getLastName(), newUser.getPassword());
        em.getTransaction().begin();
        try {
            em.persist(usr);
        } catch (Exception e) {
            e.printStackTrace();//Remove later
            return false;
        }
        em.flush();
        em.getTransaction().commit();
        em.close();
        return true;
    }

    public boolean addUser(String email, String fName, String lName,String pw){
        return addUser(new UserView(email, fName, lName,pw));
    }
    public UserView getUserViewByEmail(String email) {
        User user = getUserByEmail(email);
        UserView userView = new UserView(user.getEmail(), user.getFirstName(), user.getLastName());
        //"Translating" Messages to MessageView objects
        List<Message> msgsReceived = user.getMsgsReceived();
        userView.setMsgsReceived(convertMsgsToMsgViews(msgsReceived));
        //same for sent msgs
        List<Message> msgsSent = user.getMsgsSent();
        userView.setMsgsSent(convertMsgsToMsgViews(msgsSent));
        //same or logs
        List<Log> logs = user.getLogs();
        userView.setLogViews(convertLogsToLogsViews(logs));
        return userView;
    }

    private List<LogView> convertLogsToLogsViews(List<Log> logs) {
        List<LogView> logViews = new ArrayList<>();
        LogView logView;
        for (Log log : logs) {
            logView = new LogView(log.getDateAdded(), log.getTitle(), log.getText(), log.getOp().getEmail());
            logViews.add(logView);
        }
        return logViews;
    }

    private List<MessageView> convertMsgsToMsgViews(List<Message> msgsReceived) {
        List<MessageView> msgViews = new ArrayList<>();
        MessageView msgView;
        for (Message msg : msgsReceived) {
            msgView = new MessageView(msg.getDateSent(), msg.getTitle(), msg.getText(), msg.getSender().getEmail(), msg.getReceiver().getEmail());
            msgViews.add(msgView);
        }
        return msgViews;
    }

    public List<TrimmedUserView> getAllUserViewsTrimmed() {
        List<User> users = this.getAllUsers();
        List<TrimmedUserView> trimmedUserView = new ArrayList<>();
        TrimmedUserView trimmedUser;
        for (User user : users) {
            trimmedUser = new TrimmedUserView(user.getEmail(), user.getFirstName(), user.getLastName());
            trimmedUserView.add(trimmedUser);
        }
        return trimmedUserView;
    }

    public User getUserByEmail(String email) {
        EntityManager emg = MyEntityManagerFactory.getEntityManager();
        User user = (User) emg.createQuery("select user from User user where user.email=?1").setParameter(1, email).getSingleResult();
        emg.close();
        return user;
    }

    private List<User> getAllUsers() {
        EntityManager emg = MyEntityManagerFactory.getEntityManager();
        Query query = emg.createQuery("select user from User user");
        List<User> users = query.getResultList();//List students = q.list()?
        emg.close();
        return users;
    }

    private User getUserById(int id) {
        EntityManager emg = MyEntityManagerFactory.getEntityManager();
        User user = (User) emg.find(User.class, id);
        emg.close();
        return user;
    }

    //This function is probably useless as we do not have access to userID in frontend
    public UserView getUserViewById(int id) {
        User user = getUserById(id);
        UserView userView = new UserView(user.getEmail(), user.getFirstName(), user.getLastName());
        //"Translating" Messages to MessageView objects
        List<Message> msgsReceived = user.getMsgsReceived();
        userView.setMsgsReceived(convertMsgsToMsgViews(msgsReceived));
        //same for sent msgs
        List<Message> msgsSent = user.getMsgsSent();
        userView.setMsgsSent(convertMsgsToMsgViews(msgsSent));
        //same or logs
        List<Log> logs = user.getLogs();
        userView.setLogViews(convertLogsToLogsViews(logs));
        return userView;
    }
}
