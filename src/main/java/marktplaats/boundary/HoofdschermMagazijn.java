package marktplaats.boundary;

import marktplaats.domain.Gebruiker;

public class HoofdschermMagazijn implements Hoofdscherm{

    public void toon(Gebruiker g) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Hoofdscherm magazijnmedewerker");
        System.out.println("Wat wil je doen?");
        System.out.println("[1] - Taken bekijken");
        System.out.println("[2] - Magazijn bekijken");
        System.out.println("[3] - Bezorgstatus bekijken");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
