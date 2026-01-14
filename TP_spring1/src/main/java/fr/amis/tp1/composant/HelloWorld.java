package fr.amis.tp1.composant;

public class HelloWorld {
    private String message;
    public void setMessage (String message) {
        this.message = message;
    }

    public void display() {
        System.out.println(message);
    }
}
