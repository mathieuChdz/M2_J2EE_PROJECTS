package amis.fr.projetCustomers.configuration;

import amis.fr.projetCustomers.entity.Login;
import amis.fr.projetCustomers.repository.ILoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;

@Component
public class DataInitializer {

    @Autowired
    private ILoginDao loginDao;

    @PostConstruct
    public void init() {
        if (!loginDao.existsByName("toto")) {
            Login admin = new Login();
            admin.setName("toto");
            loginDao.save(admin);
        }
    }
}