package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Competence {

    @Id
    @GeneratedValue
    private Long c_id;
    private String intitule;

    public Competence() {}

    public Long getC_id() {
        return c_id;
    }

    public void setC_id(Long c_id) {
        this.c_id = c_id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    @Override
    public String toString() {
        return "Competence{" +
                "c_id=" + c_id +
                ", intitule='" + intitule + '\'' +
                '}';
    }
}
