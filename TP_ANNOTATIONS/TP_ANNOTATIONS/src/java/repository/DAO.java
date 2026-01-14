package repository;

import java.util.List;

public interface DAO<T> {
    <T> void insert(T obj);
    <T> List<T> findAll();
    <T> void delete(T obj);
}
