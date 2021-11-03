package marktplaats.dao;

import marktplaats.domain.Gebruiker;
import marktplaats.domain.GebruikersType;

import static marktplaats.App.em;

public class GebruikerDao {

    public Gebruiker zoek(int id) {
        return em.find(Gebruiker.class, id);
    }

    // voor registratie -- boolean return type?
    public void maakGebruiker(int id, String naam, GebruikersType type) {
        em.getTransaction().begin();
        em.persist(new Gebruiker(id, naam, type));
        em.getTransaction().commit();
    }

}
