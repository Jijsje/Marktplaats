package marktplaats.boundary;

import marktplaats.dao.GebruikerDao;
import marktplaats.domain.Gebruiker;
import marktplaats.domain.GebruikersType;

import static marktplaats.App.scanner;

public class Inlogscherm implements Boundary {

    private Gebruiker g;
    private GebruikerDao dao = new GebruikerDao();

    @Override
    public void toon() {
        // voor tests:
        maakTestGebruikers();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Vul een userID in:");
        // lees input - inloggen kan voor nu op basis van ID
        String id = scanner.nextLine();
        // validatie/authenticatie + gebruiker cachen
        valideerGebruiker(id);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private void valideerGebruiker(String id) {
        try {Integer.parseInt(id);}
        catch (NumberFormatException e) { // includes NumberFormatException
            System.out.println("FOUTE INVOER! Voer een getal in:");
            valideerGebruiker(scanner.nextLine());
            return;
        } /*catch (RuntimeException e) {
            System.out.println("Gebruiker bestaat niet. Probeer opnieuw:");
            valideerGebruiker(scanner.nextLine());
            return;
        }*/
        g = dao.zoek(Integer.parseInt(id));
    }

    public void maakTestGebruikers() {
        dao.maakGebruiker(1, "SammyStandaard", GebruikersType.STANDAARD);
        dao.maakGebruiker(2, "BertBeheerder", GebruikersType.BEHEERDER);
        dao.maakGebruiker(3, "MarkMagazijn", GebruikersType.MAGAZIJN);
    }

    public Gebruiker getActieveGebruiker() { return g; }
}
