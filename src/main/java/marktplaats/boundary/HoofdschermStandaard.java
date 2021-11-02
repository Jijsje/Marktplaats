package marktplaats.boundary;

import java.util.Scanner;

public class HoofdschermStandaard implements Hoofdscherm {

    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void toon() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Hoofdscherm standaardgebruiker");
        System.out.println("Wat wil je doen?");
        System.out.println("[1] - Kopen");
        System.out.println("[2] - Verkopen");
        System.out.println("[3] - Doe een dansje");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        verwerkKeuze();
    }

    private void verwerkKeuze() {
        String menuKeuze = scanner.nextLine();

        switch(menuKeuze) {
            case "1":
                new Aanbodscherm().toon(); break;
            case "2":
                System.out.println("asd"); break;
            case "3":
                System.out.println("Olé!"); break;
            default:
                System.out.println("Probeer het nog eens..");
                verwerkKeuze();
        }

    }
}
