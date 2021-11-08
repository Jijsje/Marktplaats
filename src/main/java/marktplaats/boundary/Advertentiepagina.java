package marktplaats.boundary;

import marktplaats.dao.AanbodDao;
import marktplaats.domain.Advertentie;

import static marktplaats.App.scanner;

public class Advertentiepagina implements Boundary {

    private AanbodDao dao = new AanbodDao();
    private Advertentie ad;

    @Override
    public void toon() {
        ad = dao.zoekOpId(scanner.nextLine());
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~Nu te koop!~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("ID:              " + ad.getId());
        System.out.println("Titel:           " + ad.getTitel());
        System.out.println("Verkoopprijs:    € " + ad.getPrijs());
        System.out.println("Verkoper:        " + ad.getVerkoper());
        System.out.println("Plaatsingsdatum: " + ad.getPlaatsingsDatum());
        System.out.println("Omschrijving:    " + ad.getOmschrijving());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("Kies een optie: ");
        System.out.println("[1] Kopen");
        System.out.println("[2] Ga terug");
        verwerkKeuze();
    }

    private void verwerkKeuze() {
        String menuKeuze = scanner.nextLine();

        switch (menuKeuze) {
            case "1":
                // start betaling, bij succes wordt de status van het product aangepast
                System.out.println("Betaling geslaagd! Je wordt teruggestuurd.");
                scanner.nextLine(); // om tijd te rekken
            case "2":
                new Aanbodscherm().toon();
                break;
            default:
                System.out.println("Commando niet herkend. Probeer het nog eens:");
                verwerkKeuze();
                break;
        }
    }
}
