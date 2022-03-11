package main.db.models;

import main.db.enums.Etat;

public class Bornette {

    private long id;

    private Etat etat;

    private Station station;

    private Velo velo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Station getStation(){
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Velo getVelo() {
        return velo;
    }

    public void setVelo(Velo velo) {
        this.velo = velo;
    }
}
