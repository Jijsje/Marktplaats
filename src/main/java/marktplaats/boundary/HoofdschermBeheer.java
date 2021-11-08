package marktplaats.boundary;

import static marktplaats.App.actieveGebruiker;

public class HoofdschermBeheer implements Hoofdscherm{

    @Override
    public void toon() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~Hoofdscherm beheerder~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("Ingelogd als " + actieveGebruiker.getGebruikersNaam());
        System.out.println("Wat wil je doen?");
        System.out.println("[1] - Gebruikers beheren");
        System.out.println("[2] - Marktplaats beheren");
        System.out.println("[3] - Magazijn bekijken");
    }
}
