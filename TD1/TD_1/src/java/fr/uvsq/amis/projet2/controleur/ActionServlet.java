package fr.uvsq.amis.projet2.controleur;

import fr.uvsq.amis.projet2.actions.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ActionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String suite = null;
        String provenance = request.getServletPath();

        System.out.println(provenance);

        if (provenance.equals("/index.jsp")) {
            Action action = new ActionIndex();
            suite  = action.execute(request, response);
        }

        else if (provenance.equals("/login.do")){
            Action action = new ActionLogin();
            suite  = action.execute(request, response);
        }

        else if (provenance.equals("/quitter.do")) {
            Action action = new ActionQuitter();
            suite  = action.execute(request, response);
        }

        else if (provenance.equals("/encore.do")) {
            Action action = new ActionEncore();
            suite  = action.execute(request, response);
        }

        getServletContext().getRequestDispatcher(suite).forward(request, response);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }


}
