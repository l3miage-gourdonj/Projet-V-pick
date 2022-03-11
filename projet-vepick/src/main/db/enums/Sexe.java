package main.db.enums;

public enum Sexe {
    HOMME("homme"), FEMME("femme");

    private String nom;

    Sexe(String nom){
        this.nom = nom;
    }
}
