package aeroport;

public class Aeroport {

    private static Aeroport instance = new Aeroport();

    private boolean piste_libre;

    private Aeroport() {
        this.piste_libre = true;
    }

    public static Aeroport getInstance() {
        return instance;
    }
}
