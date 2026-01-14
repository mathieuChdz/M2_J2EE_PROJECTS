package fr.amis.tp4;

import fr.amis.tp4.entity.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProgramMainTp4 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appTp4.xml");
        Application application =
                (Application) context.getBean("application");

        System.out.println(application.toString());
    }
}