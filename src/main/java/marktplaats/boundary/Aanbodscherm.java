package marktplaats.boundary;

import marktplaats.dao.AanbodDao;
import marktplaats.domain.Advertentie;

import java.util.List;

import static marktplaats.App.actieveGebruiker;
import static marktplaats.App.scanner;

public class Aanbodscherm implements Boundary {

    private AanbodDao aanbodDao = new AanbodDao();
    List<Advertentie> lijst = aanbodDao.haalLijstOp();

    @Override
    public void toon() {
        // maakWatAdvertenties();

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~Advertenties~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        for (Advertentie ad : lijst) {
            System.out.println(ad.toString());
        }
        System.out.println("\nMaak een keuze:");
        System.out.println("[1] Kies een advertentie");
        System.out.println("[2] Zoeken op titel");
        System.out.println("[3] Ga terug");
        verwerkKeuze();
    }

    private void verwerkKeuze() {
        String menuKeuze = scanner.nextLine();

        switch (menuKeuze) {
            case "1":
                System.out.println("Voer een ID in:");
                new Advertentiepagina().toon();
                break;
            case "2":
                System.out.println("Voer een titel in:");
                lijst = aanbodDao.zoekOpTitel(scanner.nextLine());
                toon();
                break;
            case "3":
                new HoofdschermStandaard().toon();
                break;
            default:
                System.out.println("Commando niet herkend. Probeer het nog eens:");
                verwerkKeuze();
                break;
        }
    }

    // voor testdoeleinden
    public void maakWatAdvertenties() {
        aanbodDao.maakAdvertentie("Koekenpan", 40, actieveGebruiker);
        aanbodDao.maakAdvertentie("Speelgoed", 50, actieveGebruiker);
        aanbodDao.maakAdvertentie("Schoenen", 30, actieveGebruiker);
        aanbodDao.maakAdvertentie("Gitaar", 90, actieveGebruiker);
    }

}
