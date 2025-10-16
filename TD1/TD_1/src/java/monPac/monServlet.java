package monPac;

/*
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/monAction")
public class monServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Recuperer les input
        String nom = request.getParameter("leNom");
        String prenom = request.getParameter("lePrenom");

        System.out.println("nom : "+nom+" - prenom : "+prenom);

        HttpSession maSession = request.getSession();
        maSession.setAttribute("lePrenom", prenom);

        //PrintWriter sortie = response.getWriter();
        //sortie.println("Le nom est : "+nom);

        //Si titi vas vers ok
        if(nom.equals("bg")){
            getServletContext().getRequestDispatcher("/gestionArticle.jsp").forward(request, response);
        }
        //Si titi vas vers ko
        else{
            getServletContext().getRequestDispatcher("/ko.html").forward(request, response);
        }

    }

}
