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

public class connexionServlet extends HttpServlet{

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String login = request.getParameter("leLogin");

        HttpSession maSession = request.getSession();
        maSession.setAttribute("leLogin", login);

        System.out.println("login : "+login);

        if(login.equals("")){
            getServletContext().getRequestDispatcher("/identificationVide.jsp").forward(request, response);
        }
        //Si titi vas vers ko
        else if (!login.equals("sesame")){
            getServletContext().getRequestDispatcher("/identificationWrong.jsp").forward(request, response);
        }
        else{
            getServletContext().getRequestDispatcher("/loginOk.jsp").forward(request, response);
        }

    }

}
