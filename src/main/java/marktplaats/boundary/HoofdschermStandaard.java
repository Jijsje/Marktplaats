package marktplaats.boundary;

import marktplaats.domain.Gebruiker;

import java.util.Scanner;

public class HoofdschermStandaard implements Hoofdscherm {

    private Scanner scanner = new Scanner(System.in);

    public void toon(Gebruiker g) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Hoofdscherm standaardgebruiker");
        System.out.println("Wat wil je doen?");
        System.out.println("[1] - Kopen");
        System.out.println("[2] - Verkopen");
        System.out.println("[3] - Doe een dansje");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        String menuKeuze = scanner.nextLine();

    }
}
