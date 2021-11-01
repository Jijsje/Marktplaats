package marktplaats.domain;

public class Gebruiker {

    private GebruikersType type;
    public int id;
    public String gebruikersNaam;

    public Gebruiker(){
        // voor testdoeleinden krijgt de gebruiker standaardwaarden mee
        this.id = 0;
        this.gebruikersNaam = "HarryDeTester";
        this.type = GebruikersType.STANDAARD;
    }

    public String getGebruikersNaam() {
        return gebruikersNaam;
    }

    public GebruikersType getType() {
        return type;
    }
}
