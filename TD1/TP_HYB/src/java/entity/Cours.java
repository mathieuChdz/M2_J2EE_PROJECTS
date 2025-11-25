package entity;

public class Cours {

    private Long C_Id;
    private String intitule;

    public Long getC_Id() {
        return C_Id;
    }

    public void setC_Id(Long c_Id) {
        C_Id = c_Id;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getIntitule() {
        return intitule;
    }

    public Cours(){}

    public String toString() {
        return "id: "+getC_Id()+" Nom: "+getIntitule();
    }

}
