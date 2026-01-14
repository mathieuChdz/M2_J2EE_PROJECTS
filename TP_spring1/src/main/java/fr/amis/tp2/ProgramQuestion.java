package fr.amis.tp2;

import fr.amis.tp2.service.Configure;
import fr.amis.tp2.service.FournisseurDeQuestions;
import fr.amis.tp2.service.InterfaceConfiguration;
import fr.amis.tp2.service.InterfaceFournisseurDeQuestions;
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