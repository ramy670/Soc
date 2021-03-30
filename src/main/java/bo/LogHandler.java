/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import db.User;
import db.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import viewDB.LogView;
import viewDB.UserView;

/**
 *
 * @author rami_
 */
public class LogHandler {

    public boolean addLog(LogView newLog) {
        EntityManager em = MyEntityManagerFactory.getEntityManager();
        UserHandler uh = new UserHandler();
        User op = uh.getUserByEmail(newLog.getOpEmail());
        if (op == null) {
            return false;
        }
        Log log = new Log(newLog.getDateAdded(), newLog.getTitle(), newLog.getText(), op);
        em.getTransaction().begin();
        em.persist(log);
        em.flush();
        em.getTransaction().commit();
        em.close();
        return true;
    }

    public boolean addLog(Date dateAdded, String title, String text, String op) {

        return addLog(new LogView(dateAdded, title, text, op));
    }

    public List<LogView> getLogViewsByEmail(String email) {
        UserHandler uh = new UserHandler();
        UserView userView = uh.getUserViewByEmail(email);
        List<LogView> logs = userView.getLogViews();
        return logs;
    }

    private List<Log> getAllLogs() {
        EntityManager emg = MyEntityManagerFactory.getEntityManager();
        Query query = emg.createQuery("select log from Log log");
        List<Log> logs = query.getResultList();//List students = q.list()?
        emg.close();
        return logs;
    }

    public List<LogView> getAllLogViews() {
        List<Log> logs = this.getAllLogs();
        List<LogView> logViews = new ArrayList<>();
        LogView LogView;
        for (Log log : logs) {
            LogView = new LogView(log.getDateAdded(), log.getTitle(), log.getText(), log.getOp().getEmail());
            logViews.add(LogView);
        }
        return logViews;
    }
}
