package fr.uvsq.amis.projet2.controleur;

import fr.uvsq.amis.projet2.Utils.Parser;
import fr.uvsq.amis.projet2.actions.Action;
import fr.uvsq.amis.projet2.actions.ActionLogin;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashMap;

public class Factory {

    static private Factory factory = null;

    private HashMap<String, String> map;

    private Factory() throws ParserConfigurationException, IOException, SAXException {
        map = new HashMap<>();
        Parser.parse("C:\\Users\\chedo\\Documents\\_M2\\J2EE\\TD1\\TD_1\\src\\java\\fr\\uvsq\\amis\\projet2\\Utils\\data.xml",map);
    }

    public static Factory getFactory() throws ParserConfigurationException, IOException, SAXException {
        if (factory == null){
            factory = new Factory();
        }
        return factory;
    }

    public void remplir(){
        map.put("/login.do", "fr.uvsq.amis.projet2.actions.ActionLogin");
        map.put("/quitter.do", "fr.uvsq.amis.projet2.actions.ActionQuitter");
        map.put("/encore.do", "fr.uvsq.amis.projet2.actions.ActionEncore");
        map.put("/index.jsp", "fr.uvsq.amis.projet2.actions.ActionIndex");
    }

    public Action getAction(String provenance){

        Action action = null;

        try {

            Class classAction = Class.forName(map.get(provenance));

            action = (Action) classAction.newInstance();

        } catch (ClassNotFoundException e) {
            System.err.println("Classe non trouvée");

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Erreur instantiation classe dans Factory");
            return null;
        }

        return action;
    }
}
