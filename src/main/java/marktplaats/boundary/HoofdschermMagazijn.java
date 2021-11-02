package marktplaats.boundary;

public class HoofdschermMagazijn implements Hoofdscherm{

    @Override
    public void toon() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Hoofdscherm magazijnmedewerker");
        System.out.println("Wat wil je doen?");
        System.out.println("[1] - Taken bekijken");
        System.out.println("[2] - Magazijn bekijken");
        System.out.println("[3] - Bezorgstatus bekijken");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
