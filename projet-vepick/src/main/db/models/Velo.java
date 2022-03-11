package main.db.models;

import main.db.enums.Etat;
import main.db.enums.StatusVelo;

import java.util.Date;

public class Velo {

    private int id;
    private Date dateMiseEnService;
    private Etat etat;
    private StatusVelo status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateMiseEnService() {
        return dateMiseEnService;
    }

    public void setDateMiseEnService(Date dateMiseEnService) {
        this.dateMiseEnService = dateMiseEnService;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public StatusVelo getStatus() {
        return status;
    }

    public void setStatus(StatusVelo status) {
        this.status = status;
    }
}
