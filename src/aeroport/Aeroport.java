package aeroport;

public class Aeroport {

    private static final Aeroport instance = new Aeroport();

    private boolean piste_libre;

    private Aeroport() {
        this.piste_libre = true;
    }

    public static Aeroport getInstance() {
        return instance;
    }

    synchronized public boolean autoriserDecoller() {
        if (this.piste_libre) {
            this.piste_libre = false;
            return true;
        } else {
            return false;
        }
    }

    synchronized public boolean  liberer_piste() {
        this.piste_libre = true;
        return true;
    }
}
