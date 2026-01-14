package fr.uvsq.amis.projet1.service;

import fr.uvsq.amis.projet1.modele.Login;
import fr.uvsq.amis.projet1.repository.LoginDao;
import fr.uvsq.amis.projet1.repository.LoginDaoImpl;

public class ServiceLoginImpl implements ServiceLogin{

    LoginDao dao = new LoginDaoImpl();

    @Override
    public boolean ajoute(Login login) {
        return false;
    }

    @Override
    public boolean delete(Login login) {
        return false;
    }

    @Override
    public boolean isValide(Login login) {
        return dao.existe(login);
    }
}
