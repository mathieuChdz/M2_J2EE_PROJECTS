package repository;

import entity.Info;
import factory.Factory;
import jakarta.persistence.EntityManager;

import java.util.List;

public class InfoDao implements DAO<Info>{
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
        return null;
    }

    @Override
    public <T> void delete(T obj) {

    }
}
