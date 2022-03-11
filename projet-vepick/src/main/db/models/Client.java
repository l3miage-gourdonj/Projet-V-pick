package main.db.models;

import java.util.List;

public class Client {

    private long id;

    private String carteBancaire;

    private List<Location> locations;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCarteBancaire() {
        return carteBancaire;
    }

    public void setCarteBancaire(String carteBancaire) {
        this.carteBancaire = carteBancaire;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }
}
