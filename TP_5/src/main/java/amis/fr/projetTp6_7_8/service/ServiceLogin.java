package amis.fr.projetTp6_7_8.service;

import amis.fr.projetTp6_7_8.entity.Customer;
import amis.fr.projetTp6_7_8.entity.Login;
import amis.fr.projetTp6_7_8.repository.ILoginDao;
import amis.fr.projetTp6_7_8.repository.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceLogin {

    @Autowired
    private ILoginDao loginDao;

    public void sauve(Login login){
        loginDao.save(login);
    }

    public long compter(){
        return loginDao.count();
    }

    public List<Login> listAll(){
        return (List<Login>) loginDao.findAll();
    }

    public Optional<Login> getById(Long id){
        return loginDao.findById(id);
    }

    public void deleteById(Long id){
        loginDao.deleteById(id);
    }

    public boolean isValidByName(Login login){
        return loginDao.existsByName(login.getName());
    }

}
