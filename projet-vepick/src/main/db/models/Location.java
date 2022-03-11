package main.db.models;

import java.sql.Date;
import java.util.List;

public class Location {

    private long id;

    private Date dateDebut;

    private Date dateFin;

    private List<Velo> velos;

    private Client client;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public double getPrix(){
        if(dateDebut != null && dateFin != null) {
            double duree = Math.ceil( (double) dateFin.getTime() - (double) dateDebut.getTime());
            double res = 0.0;
            for (Velo v : velos) {
                res += v.getModele().getCoutHoraire();
            }
            return (client instanceof ClientAbonne ? res * 0.7 : res);
        }
        return -1;
    }
}
