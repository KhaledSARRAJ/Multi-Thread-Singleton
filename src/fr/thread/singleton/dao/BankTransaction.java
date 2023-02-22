package fr.thread.singleton.dao;

import java.util.Date;

public class BankTransaction {
    private Long id;
    private String nom;
    private Date dateCreation;
    private String strDateCreation;
    private double chiffreAffaire;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getStrDateCreation() {
        return strDateCreation;
    }

    public void setStrDateCreation(String strDateCreation) {
        this.strDateCreation = strDateCreation;
    }

    public double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public BankTransaction() {
    }

    public BankTransaction(Long id, String nom, Date dateCreation, String strDateCreation, double chiffreAffaire) {
        this.id = id;
        this.nom = nom;
        this.dateCreation = dateCreation;
        this.strDateCreation = strDateCreation;
        this.chiffreAffaire = chiffreAffaire;
    }

    @Override
    public String toString() {
        return "BankTransaction{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", dateCreation=" + dateCreation +
                ", strDateCreation='" + strDateCreation + '\'' +
                ", chiffreAffaire=" + chiffreAffaire +
                '}';
    }
}
