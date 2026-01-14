import entity.*;
import factory.Factory;
import jakarta.persistence.EntityManager;
import repository.CompetenceDao;
import repository.InfoDao;
import repository.PersonneDao;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PG {

    public static void main(String[] args) throws SQLException {

        Competence competence1 = new Competence();
        competence1.setIntitule("Sport");

        Competence competence2 = new Competence();
        competence2.setIntitule("Maths");

        Adresse adresse1 = new Adresse();
        adresse1.setVille("Draveil");
        adresse1.setRue("avenue des lilas");

        Adresse adresse2 = new Adresse();
        adresse2.setVille("Chesnay");
        adresse2.setRue("parly 2");

        Info info1 = new Info();
        info1.setObservation("le boss en gros");
        info1.setAge(22);

        Info info2 = new Info();
        info2.setObservation("Ouais pas mal pas mal");
        info2.setAge(20);

        Personne personne = new Personne();
        personne.setNom("titi");
        personne.setAdresse(adresse1);
        personne.setInfo(info1);

        Set<Competence> competencesP1 = new HashSet<>();
        competencesP1.add(competence1);
        competencesP1.add(competence2);

        CompetenceDao competenceDao = new CompetenceDao();
        competenceDao.insert(competence1);
        competenceDao.insert(competence2);

        personne.setCompetences(competencesP1);

        PersonneDao personneDao = new PersonneDao();
        personneDao.insert(personne);

        Eleve eleve = new Eleve();
        eleve.setNom("toto");
        eleve.setAdresse(adresse2);
        eleve.setInfo(info2);

        Set<Competence> competencesP2 = new HashSet<>();
        competencesP2.add(competence1);
        competencesP2.add(competence2);

        eleve.setCompetences(competencesP1);

        personneDao.insert(eleve);

        List<Personne> listePersonnes = personneDao.findAll();
        System.out.println("liste :");
        for (Personne p : listePersonnes){
            System.out.println(p + ";\n");
        }

    }

}
