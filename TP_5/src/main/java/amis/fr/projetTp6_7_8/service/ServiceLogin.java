package amis.fr.projetTp6_7_8.service;

import amis.fr.projetTp6_7_8.entity.Login;
import amis.fr.projetTp6_7_8.repository.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceLogin {

    @Autowired
    private LoginDao loginDao;

    public void createLogin(Login login){
        if (!loginDao.isValid(login)){
            loginDao.insertLogin(login);
        }
    }
    public boolean isValidLogin(Login login){
        return loginDao.isValid(login);
    }

    public Login findByNameLogin(String name){
        return loginDao.findByName(name);
    }

}
