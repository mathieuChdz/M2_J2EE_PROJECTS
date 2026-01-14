package fr.amis.tp3.entity;

public class OptionPrime implements Option{

    public boolean avecAbonnement ;

    public void setAvecAbonnement(boolean avecAbonnement) {
        this.avecAbonnement = avecAbonnement ;
    }

    @Override
    public String afficherOption() {
        return "Option Prime : " + avecAbonnement;
    }
}
