package main.db.models;

public class Client {
    private int id;
    private String carteBancaire;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarteBancaire() {
        return carteBancaire;
    }

    public void setCarteBancaire(String carteBancaire) {
        this.carteBancaire = carteBancaire;
    }
}
