package marktplaats.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Advertentie {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String titel;
    int prijs;
    @ManyToOne
    Gebruiker verkoper;
    LocalDate plaatsingsDatum;

    public Advertentie() { }

    public Advertentie(String titel, int prijs, Gebruiker verkoper) {
        // id ontbreekt want die zou moeten worden gegenereerd
        this.titel = titel;
        this.prijs = prijs;
        this.verkoper = verkoper;
        this.plaatsingsDatum = LocalDate.now();
        // logregel: advertentie gemaakt
    }

    @Override
    public String toString() {
        return "Advertentie{" +
                "id = '" + id + '\'' +
                ", titel = '" + titel + '\'' +
                ", prijs = €" + prijs +
                ", verkoper = " + verkoper.getGebruikersNaam() +
                ", plaatsingsDatum = " + plaatsingsDatum +
                '}';
    }
}
