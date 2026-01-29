package amis.fr.projetTp6_7_8.repository;

import amis.fr.projetTp6_7_8.entity.Login;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class LoginDao {

    private ArrayList<Login> logins = new ArrayList<>();

    public void insertLogin(Login login){
        logins.add(login);
    }

    public Login findByName(String name){
        for (Login item : logins){
            if (item.getName().equals(name)){
                return item;
            }
        }
        return null;
    }

    public boolean isValid(Login login) {
        for (Login item : logins) {
            if (item.getName().equals(login.getName())) {
                return true;
            }
        }
        return false;
    }

}
