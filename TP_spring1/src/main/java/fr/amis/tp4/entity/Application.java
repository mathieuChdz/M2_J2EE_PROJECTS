package fr.amis.tp4.entity;

public class Application {
    private Fournisseur fournisseur;
    private Identite id;

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public void setId(Identite id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Application{" +
                "fournisseur=" + fournisseur +
                ", id=" + id +
                '}';
    }
}
