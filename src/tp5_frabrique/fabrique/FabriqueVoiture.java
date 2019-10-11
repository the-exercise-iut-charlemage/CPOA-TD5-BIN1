package tp5_frabrique.fabrique;

import tp5_frabrique.Vehicule;
import tp5_frabrique.Voiture;

public class FabriqueVoiture implements FabriqueVehicule {
    @Override
    public Vehicule creerVehicule() {
        return new Voiture();
    }
}
