package marktplaats.dao;

import marktplaats.domain.Advertentie;
import marktplaats.domain.Gebruiker;

import java.util.List;

import static marktplaats.App.em;

public class AanbodDao {

    // alle aanpassingen aan het aanbod door standaardgebruikers gaan via deze dao
    public List<Advertentie> haalLijstOp() {
        return em.createQuery("SELECT p FROM Advertentie p", Advertentie.class).getResultList();
    }

    public void maakAdvertentie(String titel, int prijs, Gebruiker verkoper) {
        em.getTransaction().begin();
        em.persist(new Advertentie(titel, prijs, verkoper));
        em.getTransaction().commit();
    }

}
