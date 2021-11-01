package marktplaats.boundary;

import marktplaats.domain.Gebruiker;

public class Hoofdscherm {

    // kijk of het handig is om meerdere klassen te gebruiken
    public void toonHoofdscherm(Gebruiker g) {
        checkGebruikersType(g);
    }

    private void checkGebruikersType(Gebruiker g) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        switch(g.getType()) {
            case STANDAARD:
                toonHoofdschermStandaard(); break;
            case BEHEERDER:
                toonHoofdschermBeheer(); break;
            case MAGAZIJN:
                toonHoofdschermMagazijn(); break;
        }
    }

    public void toonHoofdschermStandaard() {
        System.out.println("Hoofdscherm standaardgebruiker");
        System.out.println("Wat wil je doen?");
        System.out.println("[1] - Kopen");
        System.out.println("[2] - Verkopen");
        System.out.println("[3] - ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void toonHoofdschermBeheer() {
        System.out.println("Hoofdscherm beheerder");
    }

    public void toonHoofdschermMagazijn() {
        System.out.println("Hoofdscherm magazijnmedewerker");
    }
}
