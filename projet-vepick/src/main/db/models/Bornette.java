package main.db.models;

import main.db.enums.Etat;

public class Bornette {
    private int id;
    private Etat etat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }
}
