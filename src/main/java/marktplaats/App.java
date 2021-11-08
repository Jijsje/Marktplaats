package marktplaats;

import marktplaats.boundary.*;
import marktplaats.domain.Gebruiker;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.Scanner;

public class App {

    // de actieveGebruiker wordt gedefinieerd bij het inloggen
    // en kan overal worden gebruikt om gepersonaliseerde pagina's te tonen
    public static Gebruiker actieveGebruiker;
    public static EntityManager em = Persistence.createEntityManagerFactory("MySQL").createEntityManager();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Inlogscherm inlogScherm = new Inlogscherm();
        inlogScherm.toon();
        actieveGebruiker = inlogScherm.getActieveGebruiker();

        // afhankelijk van het type gebruiker wordt een ander hoofdscherm getoond
        Hoofdscherm hoofdscherm = Hoofdscherm.checkGebruikersType();
        hoofdscherm.toon();
    }
}
