package amis.fr.projetCustomers;

import amis.fr.projetCustomers.entity.Login;
import amis.fr.projetCustomers.service.ServiceLogin;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTp6 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("amis.fr.projetCustomers");
        context.refresh();

        ServiceLogin serviceLogin = context.getBean(ServiceLogin.class);

        Login login = new Login();
        login.setName("boss");

        /*
        serviceLogin.createLogin(login);
        System.out.println(serviceLogin.isValidLogin(login));
        System.out.println(serviceLogin.findByNameLogin("boss").toString());
         */

    }
}
