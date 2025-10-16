package fr.uvsq.amis.projet1.modele;

public class Article {
    private String nom;
    private String quantite;
    private String prix;

    public Article(){}

    public Article(String nom, String prix, String quantite) {
        this.nom = nom;
        this.quantite = quantite;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public String getQuantite() {
        return quantite;
    }

    public String getPrix() {
        return prix;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }
}
