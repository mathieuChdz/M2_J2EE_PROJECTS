package fr.uvsq.amis.projet1.repository;

import fr.uvsq.amis.projet1.modele.Login;

import java.util.List;

public interface LoginDao {
    public boolean insert(Login login);
    public boolean existe(Login login);
    public List<Login> findAll();

    // et plus ...

}
