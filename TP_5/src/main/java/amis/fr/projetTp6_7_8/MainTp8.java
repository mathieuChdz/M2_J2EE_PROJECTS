package amis.fr.projetTp6_7_8;

import amis.fr.projetTp6_7_8.entity.Customer;
import amis.fr.projetTp6_7_8.entity.Login;
import amis.fr.projetTp6_7_8.service.ServiceCustomer;
import amis.fr.projetTp6_7_8.service.ServiceLogin;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTp8 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("amis.fr.projetTp6_7_8");
        context.refresh();

        ServiceCustomer serviceCustomer = context.getBean(ServiceCustomer.class);

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();

        /*
        serviceCustomer.createCustomer(customer1);
        serviceCustomer.createCustomer(customer2);
        serviceCustomer.createCustomer(customer3);

        System.out.println(serviceCustomer.listAllCustomer());

        System.out.println(serviceCustomer.countCustomers());

        System.out.println(serviceCustomer.findByIdCustomer(2));

        System.out.println(serviceCustomer.findByNameCustomer("toto"));

        System.out.println(serviceCustomer.deleteCustomer(customer3));

        System.out.println(serviceCustomer.countCustomers());


         */
    }

}
