package marktplaats.dao;

import marktplaats.boundary.Inlogscherm;
import marktplaats.domain.Advertentie;
import marktplaats.domain.Gebruiker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.sql.SQLException;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

import static org.junit.jupiter.api.Assertions.*;

class AanbodDaoTest {

    @Test
    void haalLijstOp() {
    }

    @Test
    void testZoekOpId_geldigId() {
        AanbodDao dao = new AanbodDao();
        // De test slaagt als de advertentie vindbaar is, na een arbitraire hoeveelheid tijd
        assertTimeoutPreemptively(Duration.ofMillis(5000), () -> dao.zoekOpId("1"));
    }

    @Test
    void testZoekOpId_ongeldigId() {
        AanbodDao dao = new AanbodDao();
        // de advertentie is niet vindbaar binnen dezelfde hoeveelheid tijd,
        // omdat de prompt wacht op nieuwe invoer (wat niet kan worden gegeven)
        assertThrows(AssertionError.class, () ->
        assertTimeoutPreemptively(Duration.ofMillis(5000), () -> dao.zoekOpId("banaan")));
    }

    @Test
    void testMaakAdvertentie_geldigeAdvertentie() {
        AanbodDao dao = new AanbodDao();
        Gebruiker g = new Gebruiker();
        dao.maakAdvertentie("TestProduct", 99, g);
        assertNotNull(dao.zoekOpTitel("TestProduct"));
    }
}
