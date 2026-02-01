package amis.fr.projetCustomers;

import amis.fr.projetCustomers.entity.Adresse;
import amis.fr.projetCustomers.entity.Customer;
import amis.fr.projetCustomers.service.ServiceCustomer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("amis.fr.projetCustomers");
        appContext.refresh();
        ServiceCustomer serviceCustomer = (ServiceCustomer) appContext.getBean("serviceCustomer");


        Adresse adresse = new Adresse();
        adresse.setRue("rue de la kiffance");
        adresse.setVille("Draveil");

        serviceCustomer.sauve(new Customer("toto", "toto.boss@gmail.com", adresse));

    }
}