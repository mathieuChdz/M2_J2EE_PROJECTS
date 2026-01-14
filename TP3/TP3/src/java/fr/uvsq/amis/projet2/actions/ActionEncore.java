package fr.uvsq.amis.projet2.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionEncore implements Action{
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        String suite = "/projetFrameWork/login.jsp";
        return suite;
    }
}
