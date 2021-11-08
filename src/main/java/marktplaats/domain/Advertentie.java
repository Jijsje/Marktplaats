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
    String omschrijving;

    public Advertentie() { }

    public Advertentie(String titel, int prijs, Gebruiker verkoper) {
        // id ontbreekt want die zou moeten worden gegenereerd
        this.titel = titel;
        this.prijs = prijs;
        this.verkoper = verkoper;
        this.plaatsingsDatum = LocalDate.now();
        // logregel: advertentie gemaakt
    }

    public void setOmschrijving(String omschrijving){
        this.omschrijving = omschrijving;
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

    public int getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public int getPrijs() {
        return prijs;
    }

    public String getVerkoper() {
        return verkoper.getGebruikersNaam();
    }

    public LocalDate getPlaatsingsDatum() {
        return plaatsingsDatum;
    }

    public String getOmschrijving() {
        return omschrijving;
    }
}
