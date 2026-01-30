package amis.fr.projetTp6_7_8.configuration;

import amis.fr.projetTp6_7_8.entity.Login;
import amis.fr.projetTp6_7_8.repository.ILoginDao;
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