package fr.amis.tp2.entity;

import fr.amis.tp1.entity.Questions;

public class OptionRetour implements Option{

    public int nbJours;

    public void setNbJours(int nbJours) {
        this.nbJours = nbJours;
    }

    @Override
    public String afficherOption() {
        return "Option retour : "+nbJours;
    }
}
