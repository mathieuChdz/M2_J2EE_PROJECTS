package amis.fr.projetTp6_7_8.repository;

import amis.fr.projetTp6_7_8.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ICustomerDao extends CrudRepository<Customer, Long> {
}