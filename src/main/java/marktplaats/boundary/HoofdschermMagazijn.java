package marktplaats.boundary;

import static marktplaats.App.actieveGebruiker;

public class HoofdschermMagazijn implements Hoofdscherm{

    @Override
    public void toon() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~Hoofdscherm magazijnmedewerker~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("Ingelogd als " + actieveGebruiker.getGebruikersNaam());
        System.out.println("Wat wil je doen?");
        System.out.println("[1] - Taken bekijken");
        System.out.println("[2] - Magazijn bekijken");
        System.out.println("[3] - Bezorgstatus bekijken");
    }
}
