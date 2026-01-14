package fr.uvsq.amis.projet2.controleur;

import fr.uvsq.amis.projet2.actions.*;
import org.xml.sax.SAXException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class ActionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String provenance = request.getServletPath();

        System.out.println(provenance);

        Factory factory = null;
        try {
            factory = Factory.getFactory();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }

        Action action = factory.getAction(provenance);
        String suite = action.execute(request, response);

        getServletContext().getRequestDispatcher(suite).forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

}
