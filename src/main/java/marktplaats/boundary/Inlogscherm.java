package marktplaats.boundary;

import marktplaats.domain.Gebruiker;

import java.util.Scanner;

public class Inlogscherm {

    public Gebruiker g;
    private Scanner scanner = new Scanner(System.in);

    public Inlogscherm toonInlogscherm() {
        // inloggen kan voor nu op basis van ID
        System.out.println("Vul een userID in te loggen");
        // lees input
        String id = scanner.nextLine();
        // valideer dat gebruiker bestaat
        this.g = valideerGebruiker(id);
        // bij geldige invoer wordt Gebruiker teruggegeven
        System.out.println("Welkom " + g.gebruikersNaam);
        return this; // weet nog niet waarom het een inlogscherm zou moeten teruggeven..
    }

    private Gebruiker valideerGebruiker(String id) throws RuntimeException {
        if (Integer.parseInt(id) == 0) { // in de eerste stadia is dit altijd HarryDeTester,
            return new Gebruiker();
        } else {
            System.out.println("Incorrect username and password combination");
            throw new RuntimeException();
        }
    }

    // deze methode is vast niet ideaal, maar werkt voor nu.
    // dit zal moeten gaan werken via een controller (App.java?)
    public Gebruiker getGebruiker() {
        return g;
    }
}
