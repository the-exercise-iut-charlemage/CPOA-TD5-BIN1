package aeroport;

public class Avion extends Thread {

    private String nom;
    private Aeroport a;
    public Avion(String s) {
        this.nom = s;
    }

    @Override
    public void run() {
        this.a = Aeroport.getInstance();
        System.out.println("Je suis avion " + this.nom + " sur aeroport " + this.a);
    }
}
