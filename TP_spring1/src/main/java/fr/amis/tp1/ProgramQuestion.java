package fr.amis.tp1;

import fr.amis.tp1.service.Configure;
import fr.amis.tp1.service.FournisseurDeQuestions;
import fr.amis.tp1.service.InterfaceConfiguration;
import fr.amis.tp1.service.InterfaceFournisseurDeQuestions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProgramQuestion {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("MesBeansAMoi.xml");
        InterfaceFournisseurDeQuestions fournisseurDeQuestions =
                (FournisseurDeQuestions) context.getBean("titi");

        fournisseurDeQuestions.genereQuestionnaire();

        InterfaceConfiguration configuration = (Configure) context.getBean("choixEnvironnemnt");
        configuration.genereLaLangue();
        configuration.genereLeSysteme();
    }
}