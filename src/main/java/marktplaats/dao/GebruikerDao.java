package marktplaats.dao;

import marktplaats.domain.Gebruiker;
import marktplaats.domain.GebruikersType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static marktplaats.App.em;

public class GebruikerDao extends Dao {

    Logger logger = LoggerFactory.getLogger(GebruikerDao.class);

    public Gebruiker zoek(String id) {
        int parsedId = parseId(id);
        logger.info("Geldige zoekopdracht op GebruikerId: " + parsedId);

        /* moet een foutmelding geven als de gebruiker niet bestaat
            } catch (RuntimeException e) {
            System.out.println("Gebruiker bestaat niet. Probeer opnieuw:");
         */

        return em.find(Gebruiker.class, parsedId);
    }

    // opzet voor registratie -- boolean return type?
    public void maakGebruiker(int id, String naam, GebruikersType type) {
        em.getTransaction().begin();
        em.persist(new Gebruiker(id, naam, type));
        em.getTransaction().commit();
    }

}
