package marktplaats.boundary;

import static marktplaats.App.actieveGebruiker;

public interface Hoofdscherm extends Boundary {

    @Override
    void toon();

    static Hoofdscherm checkGebruikersType() {
        switch(actieveGebruiker.getType()) {
            case BEHEERDER:
                return new HoofdschermBeheer();
            case MAGAZIJN:
                return new HoofdschermMagazijn();
            default:
                return new HoofdschermStandaard();
        }
    }

}
