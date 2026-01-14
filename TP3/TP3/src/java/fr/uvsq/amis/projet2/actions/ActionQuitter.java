package fr.uvsq.amis.projet2.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ActionQuitter implements Action{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String suite = "/projetFrameWork/quitter.html";
        return suite;
    }
}
