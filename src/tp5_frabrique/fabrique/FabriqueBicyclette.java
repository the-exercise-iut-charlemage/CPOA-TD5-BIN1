package tp5_frabrique.fabrique;

import tp5_frabrique.Bicyclette;
import tp5_frabrique.Vehicule;

public class FabriqueBicyclette implements FabriqueVehicule {
    @Override
    public Vehicule creerVehicule() {
        return new Bicyclette();
    }
}
