package amis.fr.projetTp6_7_8.service;

import amis.fr.projetTp6_7_8.entity.Customer;
import amis.fr.projetTp6_7_8.repository.ICustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ServiceCustomer {

    @Autowired
    private ICustomerDao customerDao;

    /*
    public void createCustomer(Customer customer){
        if (!customerDao.isValid(customer)){
            customerDao.insertCustomers(customer);
        }
    }
    public boolean isValidCustomer(Customer customer){
        return customerDao.isValid(customer);
    }

    public Customer findByNameCustomer(String name){
        return customerDao.findByName(name);
    }

    public Customer findByIdCustomer(int id){
        return customerDao.findByid(id);
    }

    public List<Customer> listAllCustomer(){
        return customerDao.listAllCustomer();
    }

    public int countCustomers(){
        return customerDao.countCustomers();
    }

    public boolean deleteCustomer(Customer customer){
        return customerDao.deleteCustomer(customer);
    }
    */


    public void sauve(Customer customer){
        customerDao.save(customer);
    }

    public long compter(){
        return customerDao.count();
    }

    public List<Customer> listAll(){
        return (List<Customer>) customerDao.findAll();
    }

    public Optional<Customer> getById(Long id){
        return customerDao.findById(id);
    }

    public void deleteById(Long id){
        customerDao.deleteById(id);
    }
}