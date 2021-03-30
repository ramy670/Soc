package db;

import bo.LogHandler;
import bo.MessageHandler;
import bo.MyEntityManagerFactory;
import bo.UserHandler;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;
import viewDB.TrimmedUserView;
import viewDB.UserView;

public class MainToTest {

    public static void testAddUser() {
        EntityManager em = MyEntityManagerFactory.getEntityManager();
        User usr = new User("email5", "firstName", "lastName", "password");
        em.getTransaction().begin();
        em.persist(usr);
        em.flush();
        System.out.println("1");
        em.getTransaction().commit();
        System.out.println("2");

        em.close();
    }

    /*
    @Transactional
    public static void testAddLog() {

        EntityManager em = MyEntityManagerFactory.getEntityManager();
        UserHandler uh = new UserHandler();
        Log log = new Log(new Date(), "title2", "text2", uh.getUserByEmail("email"));
        em.getTransaction().begin();
        em.persist(log);
        em.flush();
        System.out.println("1");
        em.getTransaction().commit();
        System.out.println("2");

        em.close();
  
    }
     */
    public static void main(String[] args) {
        UserHandler uh = new UserHandler();
        uh.addUser(new UserView("email1", "firstName", "StringlastName", "Stringpassword"));
        uh.addUser(new UserView("email12", "firstName", "StringlastName", "Stringpassword"));

        MessageHandler mh = new MessageHandler();
        mh.addMessage(new Date(), "title", "text", "email2", "email1");
        mh.addMessage(new Date(), "title", "text", "email2", "email12");

        LogHandler lh = new LogHandler();
        lh.addLog(new Date(), "title", "text", "email1");
        lh.addLog(new Date(), "title", "text", "email2");
        System.out.println("Done");
        /* 
        bo.UserHandler uh= new UserHandler();
       
        System.out.println("1");
        Transaction trans = null;
        UserHandler uh = new UserHandler();
        System.out.println(uh.getUserByEmail("email").getLogs().get(0).toString());

        try {
            Session session = dbSingelton.getSessionFactory().openSession();
            if (session == null) {
                System.out.println("session=nul");
            }
            trans = session.beginTransaction();
            User usr = new User("email2", "firstName", "lastName", "password");
            session.save(usr);
            trans.commit();
            System.out.println("3");

            System.out.println("4");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

        }
         */
        
        /*
        UserHandler uh = new UserHandler();
        List<TrimmedUserView> arr = uh.getAllUserViewsTrimmed();
        System.out.println("size: "+arr.size());
        System.out.println(arr.get(0).toString());
        System.out.println("Done");
         */
    }

}
