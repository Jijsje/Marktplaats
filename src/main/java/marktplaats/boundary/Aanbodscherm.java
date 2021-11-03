package marktplaats.boundary;

import marktplaats.dao.AanbodDao;
import marktplaats.domain.Advertentie;

import java.util.List;

import static marktplaats.App.actieveGebruiker;
import static marktplaats.App.scanner;

public class Aanbodscherm implements Boundary {

    private AanbodDao aanbodDao = new AanbodDao();

    @Override
    public void toon() {
        maakWatAdvertenties(); // voor testen

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Dit is een overzicht van alle advertenties.");
        List<Advertentie> lijst = aanbodDao.haalLijstOp();
        for (Advertentie ad : lijst) {
            System.out.println(ad.toString());
        }
        System.out.println("Voer het ID in van de advertentie die je wilt bekijken:");
        String id = scanner.nextLine();
        // Toon de advertentiepagina (of ga terug)
        // Gebruikers moeten kunnen terugkeren naar het Aanbodscherm
    }

    // voor testdoeleinden
    public void maakWatAdvertenties() {
        aanbodDao.maakAdvertentie("A", 40, actieveGebruiker);
        aanbodDao.maakAdvertentie("B", 50, actieveGebruiker);
        aanbodDao.maakAdvertentie("C", 30, actieveGebruiker);
        aanbodDao.maakAdvertentie("D", 90, actieveGebruiker);
    }

}
