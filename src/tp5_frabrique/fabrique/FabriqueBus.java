package tp5_frabrique.fabrique;

import tp5_frabrique.Bus;
import tp5_frabrique.Vehicule;

public class FabriqueBus implements FabriqueVehicule {
    @Override
    public Vehicule creerVehicule() {
        return new Bus();
    }
}
