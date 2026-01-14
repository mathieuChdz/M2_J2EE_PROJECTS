package fr.amis.tp4.entity;

public class Identite {

    private Adresse adresse;

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Identite{" +
                "adresse=" + adresse +
                '}';
    }
}
