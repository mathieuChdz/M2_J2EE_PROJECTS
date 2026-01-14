package fr.uvsq.amis.projet1.service;

import fr.uvsq.amis.projet1.modele.Login;

public interface ServiceLogin {
    public boolean ajoute(Login login);
    public boolean delete(Login login);
    public boolean isValide(Login login);


}
