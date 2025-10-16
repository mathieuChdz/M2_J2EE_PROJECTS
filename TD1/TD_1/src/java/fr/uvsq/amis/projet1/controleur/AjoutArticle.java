package fr.uvsq.amis.projet1.controleur;

import fr.uvsq.amis.projet1.modele.Article;
import fr.uvsq.amis.projet1.service.ServiceArticle;
import fr.uvsq.amis.projet1.service.ServiceArticleImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class AjoutArticle extends HttpServlet {
    private static final long serialVersionUID = 1L;

    ServiceArticle serviceArticle = new ServiceArticleImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Article article = new Article();

        article.setNom(request.getParameter("articleNom"));
        article.setPrix(request.getParameter("articlePrix"));
        article.setQuantite(request.getParameter("articleQuantite"));

        serviceArticle.ajoute(article);

        List<Article> listArticles = serviceArticle.findAll();
        HttpSession maSession = request.getSession();
        maSession.setAttribute("listArticles", listArticles);

        for (Article item : listArticles){
            System.out.println(item.getNom() + " - " + item.getPrix() + " - " + item.getQuantite());
        }

        getServletContext().getRequestDispatcher("/projet1/gestionArticle.jsp").forward(request, response);
    }


}
