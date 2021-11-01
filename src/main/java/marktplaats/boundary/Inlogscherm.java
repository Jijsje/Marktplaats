package marktplaats.boundary;

import marktplaats.domain.Gebruiker;

import java.util.Scanner;

public class Inlogscherm {

    public Gebruiker g;
    private Scanner scanner = new Scanner(System.in);

    public Inlogscherm toonInlogscherm() {
        // inloggen kan voor nu op basis van ID
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Vul een userID in te loggen");
        // lees input
        String id = scanner.nextLine();
        // valideer dat gebruiker bestaat
        this.g = valideerGebruiker(id);
        // bij geldige invoer wordt Gebruiker teruggegeven
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        return this; // weet nog niet waarom het een inlogscherm zou moeten teruggeven..
    }

    // tijdelijke methode
    private Gebruiker valideerGebruiker(String id) {
        try {
            Integer.valueOf(id);
        } catch (NumberFormatException e) {
            System.out.println("Helaas makker");
        }
        if (Integer.parseInt(id) == 0) {
            return new Gebruiker(); // in de eerste stadia is dit altijd HarryDeTester,
        } else {
            return null;
        }
    }

    public Gebruiker getGebruiker() {
        return g;
    }
}
