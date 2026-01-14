package dao;

import java.io.File;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import entity.Cours;
import entity.Personne;
import entity.Personne2;
import factory.SessionFactoryHibernate;
import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Personne2Dao implements DAO<Personne2>{

    protected SessionFactory sessionFactory = SessionFactoryHibernate.getSession();

    public Personne2Dao(){}

    @Override
    public <T> void insert(T obj) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(obj) ;
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public <T> List<T> findAll() {
        try{
            Session session = sessionFactory.openSession();
            List<T> response = (List<T>) session.createQuery("FROM Personne2", Personne2.class).list();
            session.close();

            return response;
        } catch (HibernateException e) { }

        return null;
    }

    @Override
    public <T> Optional<T> findById(Class<T> clazz, Long id) {
        return Optional.empty();
    }
}