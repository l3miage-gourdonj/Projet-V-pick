package main.db.models;

import main.db.enums.StatusStation;

public class Station {
    private String adresse;
    private StatusStation status;

    public StatusStation getStatus() {
        return status;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setStatus(StatusStation status) {
        this.status = status;
    }
}
