package com.example.tp4;

public class Client {
    private String nom;
    private String prenom;
    private String sexe;
    private String[] transports;
    private String codePostal;

    public Client(String nom, String prenom, String sexe, String[] transports, String codePostal) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.transports = transports;
        this.codePostal = codePostal;
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public String[] getTransports() {
        return transports;
    }

    public String getCodePostal() {
        return codePostal;
    }
}

