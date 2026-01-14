package fr.uvsq.amis.projet1.modele;

public class Login {
    private String nom;
    private String prenom;

    public Login(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Login() {

    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
