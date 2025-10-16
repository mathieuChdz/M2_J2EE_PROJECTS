package fr.uvsq.amis.projet1.controleur;

import fr.uvsq.amis.projet1.modele.Login;
import fr.uvsq.amis.projet1.service.ServiceArticle;
import fr.uvsq.amis.projet1.service.ServiceArticleImpl;
import fr.uvsq.amis.projet1.service.ServiceLogin;
import fr.uvsq.amis.projet1.service.ServiceLoginImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Debut extends HttpServlet {
    private static final long serialVersionUID = 1L;

    ServiceLogin serviceLogin = new ServiceLoginImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Login saisi = new Login();

        saisi.setNom(request.getParameter("leNom"));
        saisi.setPrenom(request.getParameter("lePrenom"));

        if (serviceLogin.isValide(saisi)){
            //aller vers la page ok.html
            HttpSession maSession = request.getSession();
            maSession.setAttribute("login", saisi);
            maSession.setAttribute("listArticles", null);

            getServletContext().getRequestDispatcher("/projet1/gestionArticle.jsp").forward(request, response);

        }
        else{
            //aller vers la page ko.html
            getServletContext().getRequestDispatcher("/projet1/ko.html").forward(request, response);
        }
    }
}
