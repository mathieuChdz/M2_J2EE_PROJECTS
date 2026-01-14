package factory;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Factory {
    public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("titi");
}
