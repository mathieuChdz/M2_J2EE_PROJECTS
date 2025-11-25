package dao;

import entity.Diplome;
import entity.Personne;
import factory.SessionFactoryHibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Optional;

public class DiplomeDao implements DAO<Diplome>{

    protected SessionFactory sessionFactory = SessionFactoryHibernate.getSession();

    public DiplomeDao(){}

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
            List<T> response = (List<T>) session.createQuery("FROM Diplome", Diplome.class).list();
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
