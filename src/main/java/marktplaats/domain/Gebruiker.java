package marktplaats.domain;

import javax.persistence.*;

@Entity
public class Gebruiker {

    @Id
    public int id;
    public Gebruiker(){}
    public String gebruikersNaam;
    private GebruikersType type;

    public Gebruiker(int id, String gebruikersNaam, GebruikersType type) {
        this.id = id;
        this.gebruikersNaam = gebruikersNaam;
        this.type = type;
    }

    public String getGebruikersNaam() {
        return gebruikersNaam;
    }

    public GebruikersType getType() {
        return type;
    }

}
