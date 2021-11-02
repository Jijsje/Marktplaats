package marktplaats.boundary;

public class HoofdschermBeheer implements Hoofdscherm{

    @Override
    public void toon() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Hoofdscherm beheerder");
        System.out.println("Wat wil je doen?");
        System.out.println("[1] - Gebruikers beheren");
        System.out.println("[2] - Marktplaats beheren");
        System.out.println("[3] - Magazijn bekijken");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
