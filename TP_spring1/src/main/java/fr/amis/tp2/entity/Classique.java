package fr.amis.tp2.entity;

public class Classique implements ModeLivraison {
    private int delaiMoyenJours;

    public void setDelaiMoyenJours(int delaiMoyenJours) {
        this.delaiMoyenJours = delaiMoyenJours;
    }

    @Override
    public String livrer() {
        return "Livraison classique en " + delaiMoyenJours + " jours.";
    }
}