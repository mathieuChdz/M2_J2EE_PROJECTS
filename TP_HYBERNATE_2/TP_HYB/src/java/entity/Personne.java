package entity;

import java.util.HashSet;
import java.util.Set;

public class Personne {  // Plain Old Java Object   =   bean
    private Long P_Id;
    private String nom;
    private String prenom;

    private Adresse adresse = new Adresse();

    private Info info;

    private Set<Diplome> diplomes = new HashSet<>();

    public String toString() {
        return "id: "+getP_Id()+" Nom: "+getNom()+" prenom: "+getPrenom() + " - "+adresse.toString();
    }
    public Personne() {}

    public Long getP_Id() {
        return P_Id;
    }
    public void setP_Id(Long id) {
        this.P_Id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Set<Diplome> getDiplomes() {
        return diplomes;
    }

    public void setDiplomes(Set<Diplome> diplomes) {
        this.diplomes = diplomes;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
    public Adresse getAdresse() {
        return adresse;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public static void main(String[] args) {
        System.out.println("uu");
    }

}