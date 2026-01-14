package fr.amis.tp2.service;

import fr.amis.tp1.entity.Questions;
import fr.amis.tp2.entity.IMagasin;
import fr.amis.tp2.entity.Magasin;

public class ServiceMagasin implements InterfaceServiceMagasin{
    IMagasin magasin;

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public void afficherInformation() {
        System.out.println(magasin.afficheDetails());
    }
}
