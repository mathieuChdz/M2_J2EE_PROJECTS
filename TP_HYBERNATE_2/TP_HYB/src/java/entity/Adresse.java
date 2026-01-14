package entity;

public class Adresse {

    private String ville;

    private String codePostal;

    public Adresse(){}

    public String getVille() {
        return ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String toString() {
        return "Ville: "+getVille()+" Code postal: "+getCodePostal();
    }
}
