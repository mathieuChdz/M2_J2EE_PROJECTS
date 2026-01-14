package fr.amis.tp3.entity;

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
