package repository;

import entity.Personne;
import factory.Factory;
import jakarta.persistence.EntityManager;

import java.util.List;

public class PersonneDao implements DAO<Personne> {
    @Override
    public <T> void insert(T obj) {
        EntityManager entityManager = Factory.entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(obj);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public <T> List<T> findAll() {
        EntityManager entityManager = Factory.entityManagerFactory.createEntityManager();
        List listP = entityManager.createQuery("SELECT e FROM Personne e") .getResultList();
        return listP;
    }

    @Override
    public <T> void delete(T obj) {

    }
}
