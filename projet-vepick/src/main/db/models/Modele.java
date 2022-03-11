package main.db.models;

public class Modele {

    private String nom;

    private float coutHoraire;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getCoutHoraire() {
        return coutHoraire;
    }

    public void setCoutHoraire(float coutHoraire) {
        this.coutHoraire = coutHoraire;
    }
}
