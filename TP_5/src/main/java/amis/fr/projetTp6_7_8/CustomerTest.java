package amis.fr.projetTp6_7_8;

import amis.fr.projetTp6_7_8.entity.Adresse;
import amis.fr.projetTp6_7_8.entity.Customer;
import amis.fr.projetTp6_7_8.service.ServiceCustomer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("amis.fr.projetTp6_7_8");
        appContext.refresh();
        ServiceCustomer serviceCustomer = (ServiceCustomer) appContext.getBean("serviceCustomer");


        Adresse adresse = new Adresse();
        adresse.setRue("rue de la kiffance");
        adresse.setVille("Draveil");

        serviceCustomer.sauve(new Customer("toto", "toto.boss@gmail.com", adresse));

    }
}