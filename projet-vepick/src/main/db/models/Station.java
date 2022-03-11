package main.db.models;

import main.db.enums.StatusStation;

import java.util.List;

public class Station {

    private String adresse;

    private StatusStation status;

    private List<Bornette> bornettes;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public StatusStation getStatus() {
        return status;
    }

    public void setStatus(StatusStation status) {
        this.status = status;
    }

    public List<Bornette> getBornettes() {
        return bornettes;
    }

    public void setBornettes(List<Bornette> bornettes) {
        this.bornettes = bornettes;
    }
}
