package marktplaats.boundary;

import marktplaats.domain.Gebruiker;

public class HoofdschermStandaard extends Hoofdscherm {

    public void toonHoofdscherm(Gebruiker g) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Hoofdscherm standaardgebruiker");
        System.out.println("Wat wil je doen?");
        System.out.println("[1] - Kopen");
        System.out.println("[2] - Verkopen");
        System.out.println("[3] - ");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
