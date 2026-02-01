package amis.fr.projetCustomers.repository;

import amis.fr.projetCustomers.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerDao extends CrudRepository<Customer, Long> {
}