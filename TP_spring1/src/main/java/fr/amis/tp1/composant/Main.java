package fr.amis.tp1.composant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext monContext = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloWorld = (HelloWorld) monContext.getBean("hW");
        helloWorld.display();
    }

}
