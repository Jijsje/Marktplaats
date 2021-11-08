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
        // maakTestGebruikers();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~Inloggen~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("UserId:");
        String id = scanner.nextLine();
        g = dao.zoek(id);
        System.out.println("Wachtwoord:");
        scanner.nextLine();
    }

    public void maakTestGebruikers() {
        dao.maakGebruiker(1, "SammyStandaard", GebruikersType.STANDAARD);
        dao.maakGebruiker(2, "BertBeheerder", GebruikersType.BEHEERDER);
        dao.maakGebruiker(3, "MarkMagazijn", GebruikersType.MAGAZIJN);
    }

    public Gebruiker getActieveGebruiker() { return g; }
}
