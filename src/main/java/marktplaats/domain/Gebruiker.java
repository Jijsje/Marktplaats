package marktplaats.domain;

public class Gebruiker {

    public int id;
    public String gebruikersNaam;
    public Gebruiker(){
        // voor testdoeleinden krijgt de gebruiker standaardwaarden mee
        this.id = 0;
        this.gebruikersNaam = "HarryDeTester";
    }

    public String getGebruikersNaam() {
        return gebruikersNaam;
    }
}
