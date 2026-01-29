package amis.fr.projetTp6_7_8.controller;

import amis.fr.projetTp6_7_8.entity.Adresse;
import amis.fr.projetTp6_7_8.entity.Customer;
import amis.fr.projetTp6_7_8.entity.Login;
import amis.fr.projetTp6_7_8.service.ServiceCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class CustomerControlleur {

    @Autowired
    private ServiceCustomer serviceCustomer;

    @RequestMapping(value = "/")
    public String home(Model model){
        model.addAttribute("login", new Login());
        return "index";
    }

    @RequestMapping(value = "/new")
    public String newCustomerForm(Model model) {
        Customer c = new Customer();
        c.setAdresse(new Adresse());
        model.addAttribute("customer", c);

        return "newCustomer";
    }

    /*
    @PostMapping("/debut")   // action = /debut
    public String titi() {
        return "accueil";
    }
     */

    @RequestMapping(value = "/debut", method = RequestMethod.POST)
    public String start(@ModelAttribute("login") Login login, Model model) {

        String name = login.getName();
        System.out.println("name :"+name);

        if (name.equals("boss")){
            model.addAttribute("listCustomer", serviceCustomer.listAll());

            return "accueil";
        }
        return "index";
    }

    @RequestMapping(value = "/sauve", method = RequestMethod.POST)
    public String sauve(@ModelAttribute("customer") Customer customer, Model model) {

        String name = customer.getName();
        String email = customer.getEmail();
        Adresse adresse = new Adresse();
        adresse.setRue(customer.getAdresse().getRue());
        adresse.setVille(customer.getAdresse().getVille());

        Customer new_customer = new Customer(name, email, adresse);

        serviceCustomer.sauve(new_customer);

        System.out.println(customer.toString());

        model.addAttribute("listCustomer", serviceCustomer.listAll());

        return "accueil";
    }

    @GetMapping("/customer/edit")
    public String editForm(@RequestParam("id") Long id, Model model) {
        Optional<Customer> customer = serviceCustomer.getById(id);
        model.addAttribute("customer", customer);
        return "editCustomer";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute("customer") Customer customer, Model model) {
        serviceCustomer.sauve(customer);

        model.addAttribute("listCustomer", serviceCustomer.listAll());

        return "accueil";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("id") Long id, Model model) {
        serviceCustomer.deleteById(id);

        model.addAttribute("listCustomer", serviceCustomer.listAll());

        return "accueil";
    }

}
