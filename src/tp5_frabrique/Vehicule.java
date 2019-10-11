package tp5_frabrique;

public abstract class Vehicule {
    private double vistesse, vitesseMax;
    private String type;

    protected Vehicule(double vitesseMax, String type) {
        this.vitesseMax = vitesseMax;
        this.vistesse = 0;
        this.type = type;
    }

    public double getVistesse() {
        return vistesse;
    }

    public String getType() {
        return type;
    }

    public void accelerer(double vistesse) {
        if (this.vistesse + vistesse > this.vitesseMax) {
            this.vistesse = this.vitesseMax;
        } else {
            this.vistesse+=vistesse;
        }
    }

    public void decelerer(double vistesse) {
        if (this.vistesse + vistesse < 0) {
            this.vistesse = 0;
        } else {
            this.vistesse-=vistesse;
        }
    }
}
