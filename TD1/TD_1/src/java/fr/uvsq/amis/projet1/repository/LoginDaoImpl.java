package fr.uvsq.amis.projet1.repository;

import fr.uvsq.amis.projet1.modele.Login;

import java.util.ArrayList;
import java.util.List;

//Faux DAO mock
public class LoginDaoImpl implements LoginDao{

    private List<Login> listLogins = new ArrayList<Login>();

    public LoginDaoImpl(){
        listLogins.add(new Login("titi", "toto"));
        listLogins.add(new Login("tata", "pierre"));
        listLogins.add(new Login("martin", "toto"));
    }

    @Override
    public boolean insert(Login login) {
        if (!existe(login)){
            listLogins.add(login);
        }
        return false;
    }

    @Override
    public boolean existe(Login login) {
        for(Login loginItem : listLogins){
            if (loginItem.getNom().equals(login.getNom()) && loginItem.getPrenom().equals(login.getPrenom())){
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Login> findAll() {
        return null;
    }
}
