package amis.fr.projetCustomers.repository;

import amis.fr.projetCustomers.entity.Login;
import org.springframework.data.repository.CrudRepository;

public interface ILoginDao extends CrudRepository<Login, Long> {

    boolean existsByName(String name);

}