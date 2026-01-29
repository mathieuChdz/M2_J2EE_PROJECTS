package amis.fr.region.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ville {

    @Value("Lille")
    private String capital;

    public String getCapital() {
        return capital;
    }

    public void setNom(String nom) {
        this.capital = nom;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + capital + '\'' +
                '}';
    }
}
