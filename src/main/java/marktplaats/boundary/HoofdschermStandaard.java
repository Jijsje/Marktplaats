package marktplaats.boundary;

import java.util.Scanner;

import static marktplaats.App.actieveGebruiker;

public class HoofdschermStandaard implements Hoofdscherm {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void toon() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~Hoofdscherm standaardgebruiker~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("Ingelogd als " + actieveGebruiker.getGebruikersNaam());
        System.out.println("Wat wil je doen?");
        System.out.println("[1] - Kopen");
        System.out.println("[2] - Verkopen");
        System.out.println("[3] - Doe een dansje");
        verwerkKeuze();
    }

    private void verwerkKeuze() {
        String menuKeuze = scanner.nextLine();

        switch(menuKeuze) {
            case "1":
                new Aanbodscherm().toon(); break;
            case "2":
                System.out.println("I haven't programmed that path yet");
                // nieuw scherm om gegevens in te vullen
                verwerkKeuze(); break;
            case "3":
                System.out.println("Olé!"); break;
            default:
                System.out.println("Probeer het nog eens..");
                verwerkKeuze(); break;
        }

    }
}
