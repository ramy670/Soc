package db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.spi.ServiceException;

public class dbSingelton {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                sessionFactory = new Configuration().configure().buildSessionFactory();
                return sessionFactory;

            } catch (ServiceException e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }

}
