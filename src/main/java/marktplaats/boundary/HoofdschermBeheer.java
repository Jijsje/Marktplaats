package marktplaats.boundary;

import marktplaats.domain.Gebruiker;

public class HoofdschermBeheer implements Hoofdscherm{

    public void toon(Gebruiker g) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Hoofdscherm beheerder");
        System.out.println("Wat wil je doen?");
        System.out.println("[1] - Gebruikers beheren");
        System.out.println("[2] - Marktplaats beheren");
        System.out.println("[3] - Magazijn bekijken");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
