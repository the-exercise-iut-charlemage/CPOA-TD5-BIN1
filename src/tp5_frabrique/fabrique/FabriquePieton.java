package tp5_frabrique.fabrique;

import tp5_frabrique.Pieton;
import tp5_frabrique.Vehicule;

public class FabriquePieton implements FabriqueVehicule {
    @Override
    public Vehicule creerVehicule() {
        return new Pieton();
    }
}
