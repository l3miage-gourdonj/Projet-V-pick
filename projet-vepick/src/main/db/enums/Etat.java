package main.db.enums;

public enum Etat {
    OK("OK"), HS("HS");

    private String nom;

    Etat(String nom){
        this.nom = nom;
    }
}
