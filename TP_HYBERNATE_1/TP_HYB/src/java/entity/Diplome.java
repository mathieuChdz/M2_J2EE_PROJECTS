package entity;

public class Diplome {

    private Long D_id;
    private String nom;

    public Diplome(){}

    public Long getD_id() {
        return D_id;
    }

    public String getNom() {
        return nom;
    }

    public void setD_id(Long d_id) {
        D_id = d_id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Diplome{" +
                "D_id=" + D_id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
