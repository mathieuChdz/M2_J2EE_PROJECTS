package amis.fr.projetTp6_7_8.controller;

import amis.fr.projetTp6_7_8.entity.Login;
import amis.fr.projetTp6_7_8.service.ServiceCustomer;
import amis.fr.projetTp6_7_8.service.ServiceLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginControlleur {

    @Autowired
    private ServiceLogin serviceLogin;

    @Autowired
    private ServiceCustomer serviceCustomer;

    @RequestMapping(value = "/")
    public String home(Model model){
        model.addAttribute("login", new Login());
        return "index";
    }

    @RequestMapping(value = "/debut", method = RequestMethod.POST)
    public String start(@ModelAttribute("login") Login login, Model model) {

        if (serviceLogin.isValidByName(login)){
            model.addAttribute("listCustomer", serviceCustomer.listAll());

            return "accueil";
        }
        return "redirect:/";
    }

}
