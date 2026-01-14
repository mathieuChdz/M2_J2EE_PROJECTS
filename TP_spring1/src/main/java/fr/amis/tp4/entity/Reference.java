package fr.amis.tp4.entity;

public class Reference {
    private String siret;

    public void setSiret(String siret) {
        this.siret = siret;
    }

    @Override
    public String toString() {
        return "Reference{" +
                "siret='" + siret + '\'' +
                '}';
    }
}
