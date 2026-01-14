package dao;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {
    <T> void insert(T obj);
    <T> List<T> findAll();

    <T> Optional<T> findById(Class<T> clazz, Long id);
}
