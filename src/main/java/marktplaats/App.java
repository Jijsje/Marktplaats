package marktplaats;

import marktplaats.boundary.*;
import marktplaats.domain.Gebruiker;

public class App {

    // de actieveGebruiker wordt gedefinieerd bij het inloggen
    // en kan overal worden gebruikt om gepersonaliseerde pagina's te tonen
    static Gebruiker actieveGebruiker;

    public static void main(String[] args) {
        Inlogscherm inlogScherm = new Inlogscherm().toonInlogscherm();
        // na inloggen kan de actieveGebruiker worden opgehaald vanaf het inlogscherm
        actieveGebruiker = inlogScherm.getGebruiker();
        System.out.println(actieveGebruiker.getGebruikersNaam() + " is ingelogd!");

        // vervolgens wordt een hoofdscherm getoond voor die gebruiker
        checkGebruikersType();
        new Hoofdscherm().toonHoofdscherm(actieveGebruiker);
    }

    private static void checkGebruikersType() {
        switch(actieveGebruiker.getType()) {
            case STANDAARD:
                new HoofdschermStandaard().toonHoofdscherm(actieveGebruiker); break;
            case BEHEERDER:
                new HoofdschermBeheer().toonHoofdscherm(actieveGebruiker); break;
            case MAGAZIJN:
                new HoofdschermMagazijn().toonHoofdscherm(actieveGebruiker); break;
        }
    }
}
