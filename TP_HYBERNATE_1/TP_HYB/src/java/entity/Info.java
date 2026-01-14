package entity;

public class Info {

    private Long P_id;
    private String adresseEcole;
    private String nomEcole;

    public Info(){}
    public Long getP_id() {
        return P_id;
    }

    public void setP_id(Long id) {
        P_id = id;
    }

    public String getAdresseEcole() {
        return adresseEcole;
    }

    public void setAdresseEcole(String adresseEcole) {
        this.adresseEcole = adresseEcole;
    }

    public String getNomEcole() {
        return nomEcole;
    }

    public void setNomEcole(String nomEcole) {
        this.nomEcole = nomEcole;
    }

    @Override
    public String toString() {
        return "Info{" +
                "P_id=" + P_id +
                ", adresseEcole='" + adresseEcole + '\'' +
                ", nomEcole='" + nomEcole + '\'' +
                '}';
    }
}
