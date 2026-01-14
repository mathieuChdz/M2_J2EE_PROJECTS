package entity;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="eleve")
public class Eleve extends Personne{
    String num;

    public Eleve() {}

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}