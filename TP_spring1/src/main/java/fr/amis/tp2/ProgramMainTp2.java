package fr.amis.tp2;

import fr.amis.tp2.service.InterfaceServiceMagasin;
import fr.amis.tp2.service.ServiceMagasin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProgramMainTp2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("magasin.xml");
        InterfaceServiceMagasin serviceMagasin =
                (ServiceMagasin) context.getBean("serviceMagasin");

        serviceMagasin.afficherInformation();

    }
}