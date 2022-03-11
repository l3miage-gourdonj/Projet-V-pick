package main.db.models;

import java.util.Date;

public class ClientAbonne extends Client{
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String adresse;
    private String codeSecret;
    private int creditTemps;
    private Date dateDebutAbonnement;
    private Date dateFinAbonnement;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodeSecret() {
        return codeSecret;
    }

    public void setCodeSecret(String codeSecret) {
        this.codeSecret = codeSecret;
    }

    public int getCreditTemps() {
        return creditTemps;
    }

    public void setCreditTemps(int creditTemps) {
        this.creditTemps = creditTemps;
    }

    public Date getDateDebutAbonnement() {
        return dateDebutAbonnement;
    }

    public void setDateDebutAbonnement(Date dateDebutAbonnement) {
        this.dateDebutAbonnement = dateDebutAbonnement;
    }

    public Date getDateFinAbonnement() {
        return dateFinAbonnement;
    }

    public void setDateFinAbonnement(Date dateFinAbonnement) {
        this.dateFinAbonnement = dateFinAbonnement;
    }
}
