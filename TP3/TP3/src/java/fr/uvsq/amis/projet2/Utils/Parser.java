package fr.uvsq.amis.projet2.Utils;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Parser {

    public static HashMap<String, String> parse(String cheminFichier, HashMap map) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(cheminFichier);
        Element racine = document.getDocumentElement();
        NodeList bases = racine.getElementsByTagName("lien");

        String itemX = null;
        String itemY = null;

        for (int i = 0; i < bases.getLength(); i++) {
            Node base = bases.item(i);
            NodeList elements = base.getChildNodes();

            for (int j = 0; j < elements.getLength(); j++) {
                Node element = elements.item(j);

                if (element.getNodeType() == Node.ELEMENT_NODE) {
                    if (element.getNodeName().equals("url-pattern")) {
                        itemX = element.getTextContent().trim();
                    } else if (element.getNodeName().equals("actions")) {
                        itemY = element.getTextContent().trim();
                    }
                }
            }

            // Une fois les deux valeurs trouvées, on les met dans la map
            if (itemX != null && itemY != null) {
                map.put(itemX, itemY);
                // Réinitialiser pour le prochain <lien>
                itemX = null;
                itemY = null;
            }
        }

        return map;
    }


    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        HashMap<String, String> map = new HashMap<>();
        map = Parser.parse("C:\\Users\\chedo\\Documents\\_M2\\J2EE\\TD1\\TD_1\\src\\java\\fr\\uvsq\\amis\\projet2\\Utils\\data.xml",map);

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Clé : " + entry.getKey() + " | Valeur : " + entry.getValue());
        }

    }


}
