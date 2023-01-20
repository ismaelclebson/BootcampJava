package bd;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
    @SuppressWarnings("unused")
    private static final String pathHibernateCfg = "src/META-INF/hibernate.cfg.xml";

    public static SessionFactory getSessionFactory() throws InterruptedException {
        return (SessionFactory) new Configuration().configure().buildSessionFactory();
    }

    public static Session getSession() throws HibernateException {

        SessionFactory sessionFactory = new Configuration().configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session;
    }
}
