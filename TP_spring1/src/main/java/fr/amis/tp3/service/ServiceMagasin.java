package fr.amis.tp3.service;

import fr.amis.tp3.entity.IMagasin;
import fr.amis.tp3.entity.Magasin;

public class ServiceMagasin implements InterfaceServiceMagasin{
    IMagasin magasin;

    public void setMagasin(Magasin magasin) {
        this.magasin = magasin;
    }

    public void afficherInformation() {
        System.out.println(magasin.afficheDetails());
    }
}
