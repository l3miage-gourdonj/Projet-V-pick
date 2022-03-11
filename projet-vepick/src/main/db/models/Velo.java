package main.db.models;

import main.db.enums.Etat;
import main.db.enums.StatusVelo;

import java.util.Date;

public class Velo {

    private int id;

    private Date dateMiseEnService;

    private Etat etat;

    private StatusVelo status;

    private Bornette bornette;

    private Modele modele;

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

    public Bornette getBornette() {
        return bornette;
    }

    public void setBornette(Bornette bornette) {
        this.bornette = bornette;
    }

    public Modele getModele() {
        return modele;
    }

    public void setModele(Modele modele) {
        this.modele = modele;
    }
}
