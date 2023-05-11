package com.example.empreses.entitats;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Alumne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String dni;
    private String nom;
    private String cognoms;
    private String cicle;
    private String modalitat;
    private String estatPractiques;

    public Alumne() {
    }

    public Alumne(long id, String dni, String nom, String cognoms, String cicle, String modalitat, String estatPractiques) {
        this.id = id;
        this.dni = dni;
        this.nom = nom;
        this.cognoms = cognoms;
        this.cicle = cicle;
        this.modalitat = modalitat;
        this.estatPractiques = estatPractiques;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getCicle() {
        return cicle;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public String getModalitat() {
        return modalitat;
    }

    public void setModalitat(String modalitat) {
        this.modalitat = modalitat;
    }

    public String getEstatPractiques() {
        return estatPractiques;
    }

    public void setEstatPractiques(String estatPractiques) {
        this.estatPractiques = estatPractiques;
    }
}
