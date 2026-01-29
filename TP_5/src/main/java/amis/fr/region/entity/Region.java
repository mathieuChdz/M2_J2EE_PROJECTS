package amis.fr.region.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Region {

    private String nomRegion;

    @Autowired
    private Pays pays;

    @Autowired
    private Ville ville;

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public Pays getPays() {
        return pays;
    }

    public Ville getVille() {
        return ville;
    }

    public void affiche(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Region{" +
                "nomRegion='" + nomRegion + '\'' +
                ", pays=" + pays +
                ", ville=" + ville +
                '}';
    }
}
