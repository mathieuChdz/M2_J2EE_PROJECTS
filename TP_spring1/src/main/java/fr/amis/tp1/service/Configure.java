package fr.amis.tp1.service;

import fr.amis.tp1.entity.Langue;
import fr.amis.tp1.entity.Systeme;

public class Configure implements InterfaceConfiguration{

    Langue laLangue;
    Systeme leSysteme;

    public void genereLaLangue() {
        System.out.println(laLangue.afficheConfiguration());
    }

    public void genereLeSysteme() {
        System.out.println(leSysteme.afficheConfiguration());
    }

    public void setLaLangue(Langue langue) {
        this.laLangue = langue;
    }

    public void setLeSysteme(Systeme systeme) {
        this.leSysteme = systeme;
    }

}
