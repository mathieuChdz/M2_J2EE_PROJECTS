package fr.amis.tp2.entity;

import fr.amis.tp2.entity.ModeLivraison;
import fr.amis.tp2.entity.Option;

import java.util.List;

public class Magasin implements IMagasin{
    private String nom;
    private ModeLivraison modeLivraison;
    private List<Option> options;


    public Magasin(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public ModeLivraison getModeLivraison() {
        return modeLivraison;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setModeLivraison(ModeLivraison modeLivraison) {
        this.modeLivraison = modeLivraison;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    @Override
    public String afficheDetails() {
        String res = "nom : "+ nom + " - mode livraison : "+ modeLivraison.livrer() + " - options : {";
        for(Option item : options){
            res += item.afficherOption() + " | ";
        }
        res+="}";
        return res;
    }
}
