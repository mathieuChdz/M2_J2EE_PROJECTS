import dao.CoursDao;
import dao.DiplomeDao;
import dao.InfoDao;
import dao.PersonneDao;
import entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.io.File;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

    public static void main(String[] args) throws SQLException {

        Diplome diplome1 = new Diplome();
        diplome1.setNom("BAC");

        Diplome diplome2 = new Diplome();
        diplome2.setNom("MASTER");

        Adresse adresse = new Adresse();
        adresse.setVille("Draveil");
        adresse.setCodePostal("91210");

        Info info = new Info();
        info.setAdresseEcole("Versailles");
        info.setNomEcole("UVSQ");

        Personne p1 = new Personne();
        p1.setNom("bg");
        p1.setPrenom("mathieu");
        p1.setAdresse(adresse);
        p1.setInfo(info);

        Set<Diplome> diplomesP1 = new HashSet<>();
        diplomesP1.add(diplome1);
        diplomesP1.add(diplome2);
        p1.setDiplomes(diplomesP1);


        Personne p2  = new Personne();
        p2.setNom("paco");
        p2.setPrenom("olly");
        p2.setAdresse(adresse);
        p2.setInfo(info);

        Set<Diplome> diplomesP2 = new HashSet<>();
        diplomesP2.add(diplome1);
        p2.setDiplomes(diplomesP2);

        Cours c1 = new Cours();
        c1.setIntitule("graphes");

        Cours c2 = new Cours();
        c2.setIntitule("optimisation");

        //Test de la commande insert

        DiplomeDao diplomeDao = new DiplomeDao();
        diplomeDao.insert(diplome1);
        diplomeDao.insert(diplome2);

        InfoDao infoDao = new InfoDao();
        infoDao.insert(info);

        PersonneDao personneDao = new PersonneDao();
        personneDao.insert(p1);
        personneDao.insert(p2);

        CoursDao coursDao = new CoursDao();
        coursDao.insert(c1);
        coursDao.insert(c2);

        //Test de la commande FindAll
        List<Personne> personnes = personneDao.findAll();
        for (Personne p:personnes) {
            System.out.println(p.toString());
        }

        List<Cours> cours = coursDao.findAll();
        for (Cours c:cours) {
            System.out.println(c.toString());
        }

    }
}
