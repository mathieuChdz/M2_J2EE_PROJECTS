package entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Personne {

    @Id
    @GeneratedValue
    private Long P_Id;
    private String nom;

    private String prenom;

    @OneToOne(cascade = CascadeType.ALL)
    private Info info;

    @Embedded
    private Adresse adresse;

    @ManyToMany
    private Set<Competence> competences = new HashSet<>();

    public Personne(){}

    public Long getP_Id() {
        return P_Id;
    }

    public void setP_Id(Long p_Id) {
        P_Id = p_Id;
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

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Set<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(Set<Competence> competences) {
        this.competences = competences;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "P_Id=" + P_Id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", info=" + info +
                ", adresse=" + adresse +
                ", competences=" + competences +
                '}';
    }
}
