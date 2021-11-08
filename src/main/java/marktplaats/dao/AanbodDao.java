package marktplaats.dao;

import marktplaats.domain.Advertentie;
import marktplaats.domain.Gebruiker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static marktplaats.App.em;

// Dao voor standaardgebruikers
public class AanbodDao extends Dao {

    Logger logger = LoggerFactory.getLogger(AanbodDao.class);

    public List<Advertentie> haalLijstOp() {
        logger.info("Lijst van advertenties wordt opgehaald.");
        return em.createQuery("SELECT a FROM Advertentie a", Advertentie.class).getResultList();
    }

    public Advertentie zoekOpId(String id) {
        int parsedId = parseId(id);
        logger.info("Geldige zoekopdracht op AdvertentieId: " + parsedId);
        return em.find(Advertentie.class, parsedId);
        // SQLexception (not found) afvangen
    }

    public List<Advertentie> zoekOpTitel(String gevraagdeTitel) {
        logger.info("Geldige zoekopdracht op AdvertentieTitel: " + gevraagdeTitel);
        var q = em.createQuery("SELECT a FROM Advertentie a WHERE a.titel = :titel", Advertentie.class);
        return q.setParameter("titel", gevraagdeTitel).getResultList();
        // SQLexception (not found) afvangen
    }

    public void maakAdvertentie(String titel, int prijs, Gebruiker verkoper) {
        em.getTransaction().begin();
        em.persist(new Advertentie(titel, prijs, verkoper));
        em.getTransaction().commit();
    }
}
