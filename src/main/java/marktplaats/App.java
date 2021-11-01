package marktplaats;

import marktplaats.boundary.Inlogscherm;
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
    }
}
