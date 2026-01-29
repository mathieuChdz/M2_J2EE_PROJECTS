package amis.fr.projetTp6_7_8.entity;

public class Login {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Login{" +
                "name='" + name + '\'' +
                '}';
    }
}
