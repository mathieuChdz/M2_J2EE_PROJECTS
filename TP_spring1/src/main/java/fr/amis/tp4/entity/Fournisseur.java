package fr.amis.tp4.entity;

public class Fournisseur {

    private String nom;
    private Reference ref;

    Fournisseur(Reference ref){
        this.ref = ref;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setRef(Reference ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "Fournisseur{" +
                "nom='" + nom + '\'' +
                ", ref=" + ref +
                '}';
    }
}
