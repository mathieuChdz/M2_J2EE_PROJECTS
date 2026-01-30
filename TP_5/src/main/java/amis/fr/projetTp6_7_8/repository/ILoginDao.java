package amis.fr.projetTp6_7_8.repository;

import amis.fr.projetTp6_7_8.entity.Customer;
import amis.fr.projetTp6_7_8.entity.Login;
import org.springframework.data.repository.CrudRepository;

public interface ILoginDao extends CrudRepository<Login, Long> {

    boolean existsByName(String name);

}