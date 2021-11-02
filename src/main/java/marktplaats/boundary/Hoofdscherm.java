package marktplaats.boundary;

import marktplaats.domain.Gebruiker;

public interface Hoofdscherm {

    void toon(Gebruiker g);

    static Hoofdscherm checkGebruikersType(Gebruiker g) {
        switch(g.getType()) {
            case BEHEERDER:
                return new HoofdschermBeheer();
            case MAGAZIJN:
                return new HoofdschermMagazijn();
            default:
                return new HoofdschermStandaard();
        }
    }

}
