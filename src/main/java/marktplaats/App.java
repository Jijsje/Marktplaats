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
        // na inloggen kan de actieveGebruiker worden opgehaald vanaf het inlogscherm
        actieveGebruiker = inlogScherm.getActieveGebruiker();
        System.out.println(actieveGebruiker.getGebruikersNaam() + " is ingelogd!");

        // vervolgens wordt een hoofdscherm getoond voor dit type gebruiker
        Hoofdscherm hoofdscherm = Hoofdscherm.checkGebruikersType();
        hoofdscherm.toon();
        // vanaf hier verwijzen pagina's naar elkaar

    }
}
