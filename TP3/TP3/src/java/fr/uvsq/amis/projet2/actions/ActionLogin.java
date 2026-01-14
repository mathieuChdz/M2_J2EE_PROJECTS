package fr.uvsq.amis.projet2.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ActionLogin implements Action{

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String login = request.getParameter("leLogin");
        String suite = null;

        if (login.equals("titi")){
            //aller vers la page ok.html
            HttpSession maSession = request.getSession();

            suite = "/projetFrameWork/travaille.jsp";

        }
        else{
            //aller vers la page ko.html

            suite = "/projetFrameWork/erreur.jsp";
        }
        return suite;
    }
}
