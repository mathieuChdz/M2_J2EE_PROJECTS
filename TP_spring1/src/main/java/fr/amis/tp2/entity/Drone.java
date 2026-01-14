package fr.amis.tp2.entity;

public class Drone implements ModeLivraison {
    private String typeLogement;

    public Drone() { }

    public String getTypeLogement() {
        return typeLogement;
    }

    public void setTypeLogement(String typeLogement) {
        this.typeLogement = typeLogement;
    }
    @Override
    public String livrer() {
        return "Livraison par drone vers un " + typeLogement;
    }
}