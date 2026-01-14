package factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.io.File;

public class SessionFactoryHibernate {
    private static SessionFactory sessionFactory;

    // Empêche l'instanciation
    private SessionFactoryHibernate() {}

    public static SessionFactory getSession(){
        if (sessionFactory == null){
            File configFile = new File("hibernate.cfg.xml");
            final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure(configFile).build();

            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        }
        return  sessionFactory;
    }

}
