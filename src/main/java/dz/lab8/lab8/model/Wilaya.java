package dz.lab8.lab8.model;

import java.util.Date;

public class Wilaya {
    private int id;
    private boolean actif;
    private int compte_creation;
    private int compte_maj;
    private Date date_creation;
    private Date date_maj;
    private String nom_arabe;
    private String nom_latin;
    private String nom_tamazight;

    public Wilaya(int id, boolean actif, int compte_creation, int compte_maj, Date date_creation, Date date_maj, String nom_arabe, String nom_latin, String nom_tamazight) {
        this.id = id;
        this.actif = actif;
        this.compte_creation = compte_creation;
        this.compte_maj = compte_maj;
        this.date_creation = date_creation;
        this.date_maj = date_maj;
        this.nom_arabe = nom_arabe;
        this.nom_latin = nom_latin;
        this.nom_tamazight = nom_tamazight;
    }

    @Override
    public String toString() {
        return "Wilaya{id=" + id +
                ", actif='" + actif + '\'' +
                ", compte_creation='" + compte_creation + '\'' +
                ", compte_maj='" + compte_maj + '\'' +
                ", date_creation='" + date_creation + '\'' +
                ", date_maj='" + date_maj + '\'' +
                ", nom_arabe='" + nom_arabe + '\'' +
                ", nom_latin='" + nom_latin + '\'' +
                ", nom_tamazight=" + nom_tamazight +
                '}';
    }
}
