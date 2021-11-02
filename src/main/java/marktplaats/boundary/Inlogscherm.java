package marktplaats.boundary;

import marktplaats.domain.Gebruiker;
import marktplaats.domain.GebruikersType;

import java.util.Scanner;

public class Inlogscherm implements Boundary {

    public Gebruiker g;
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void toon() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Vul een userID in te loggen");
        // lees input - inloggen kan voor nu op basis van ID
        String id = scanner.nextLine();
        // validatie/authenticatie + gebruiker cachen
        valideerGebruiker(id);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    // Dit komt in een DAO en wordt obv naam/wachtwoord combi
    private void valideerGebruiker(String id) {
        try {
            int intId = Integer.parseInt(id);
            if(intId < 1 || intId > 3 ) { throw new RuntimeException();}
        } catch (RuntimeException e) { // includes NumberFormatException
            System.out.println("FOUTE INVOER! Voer een getal tussen 1 en 3 in (incl.)");
            valideerGebruiker(scanner.nextLine());
            return;
        }
        maakTestGebruiker(Integer.parseInt(id));
    }

    private void maakTestGebruiker(int type) {
        switch (type) {
            case 1:
                g = new Gebruiker(1, "SammyStandaard", GebruikersType.STANDAARD);
                break;
            case 2:
                g = new Gebruiker(2, "BertBeheerder", GebruikersType.BEHEERDER);
                break;
            case 3:
                g = new Gebruiker(3, "MarkMagazijn", GebruikersType.MAGAZIJN);
                break;
        }
    }

    public Gebruiker getGebruiker() {
        return g;
    }
}
