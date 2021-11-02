package marktplaats.domain;

public class Gebruiker {

    public int id;
    private GebruikersType type;
    public String gebruikersNaam;

    public Gebruiker(){
        // voor testdoeleinden krijgt de gebruiker standaardwaarden mee
        this.id = 0;
        this.type = GebruikersType.STANDAARD;
        this.gebruikersNaam = "HarryDeTester";
    }

    public Gebruiker(int id, GebruikersType type, String gebruikersNaam) {
        this.id = id;
        this.type = type;
        this.gebruikersNaam = gebruikersNaam;
    }

    public String getGebruikersNaam() {
        return gebruikersNaam;
    }

    public GebruikersType getType() {
        return type;
    }
}
