package com.example.empreses.entitats;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String cif;
    private String nom;
    private String adreca;
    private String cicle;
    private int numAlumnesFentPractiques;

    public Empresa() {
    }

    public Empresa(long id, String cif, String nom, String adreca, String cicle, int numAlumnesFentPractiques) {
        this.id = id;
        this.cif = cif;
        this.nom = nom;
        this.adreca = adreca;
        this.cicle = cicle;
        this.numAlumnesFentPractiques = numAlumnesFentPractiques;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public String getCicle() {
        return cicle;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public int getNumAlumnesFentPractiques() {
        return numAlumnesFentPractiques;
    }

    public void setNumAlumnesFentPractiques(int numAlumnesFentPractiques) {
        this.numAlumnesFentPractiques = numAlumnesFentPractiques;
    }
}
